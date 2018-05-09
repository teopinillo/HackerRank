//https://www.youtube.com/watch?v=M6lYob8STMI
//http://www.newthinktank.com/2013/03/binary-tree-in-java/



public class BinaryTree {
	
	Node root;
	
	//adding a node
	public void addNode (int key, String name){
		Node newNode = new Node (key, name);
		
		 if (root == null){
			root = newNode;
		 } else {
			 Node focusNode = root;
			 Node parent;
			 while (true){
				 // Set root as the Node we will start
				 // with as we traverse the tree
				 	parent = focusNode;
				 	
				 	if (key < focusNode.key){
				 		focusNode = focusNode.left;
				 		 if (focusNode == null){
				 			 parent.left = newNode;
				 			 return;
				 		 }
				 	} else {
				 		focusNode = focusNode.right;
				 		if (focusNode == null){
				 			parent.right = newNode;
				 			return;
				 		}
				 	}
			 }
			 
		 }
		
	}
	
	public Node findNode (int key){
		Node focusNode = root;
		
		while(focusNode.key != key){
			if (key < focusNode.key ){
				focusNode = focusNode.left;
			}else {
				focusNode = focusNode.right;
			}
			
			if (focusNode== null) return null;
		}
		return focusNode;
	}
	//
	//In order Traversal
	//
	//-> Aim for the smallest value first
	//-> Start at 1st left child
	//-> when null is reached then move up in value
	
	public  void inOrderTraverseTree(Node focusNode){
		if (focusNode!=null){			
			inOrderTraverseTree (focusNode.left);	
			   System.out.println (focusNode);
			inOrderTraverseTree (focusNode.right);
		}
	}
	
	//
	//PRE ORDER TRAVERSAL
	//
	public  void preOrderTraverseTree(Node focusNode){
		if (focusNode!=null){
			System.out.println (focusNode);
			inOrderTraverseTree (focusNode.left);
			inOrderTraverseTree (focusNode.right);
		}
	}
	
	//
	//POST ORDER TRAVERSAL
	//
	public  void postOrderTraverseTree(Node focusNode){
		if (focusNode!=null){			
			inOrderTraverseTree (focusNode.left);
			inOrderTraverseTree (focusNode.right);
			System.out.println (focusNode);
		}
	}
	
	public boolean remove(int key){
		
		Node focusNode = root;
		Node parent = root;
		
		boolean isItALeftChild = true;
		
		while (focusNode.key!=){
			
			parent = focusNode;
			
			if (key < focusNode.key){
				
				isItALeftChild = true;
				
				focusCodeNode = focusNode.lest;
			}else {
				
				isItALeftChild = false;
			}
			
			if (focusNode == null) return false;
		}
		
		if ((focusNode.leftChild ==null) && (focusNode.right==null)) {
			
			if (focusNode == root){
				
				root = null;
				
			}else if (isItALeftChild){
				parent.left = null;
			}else {
				parent.right = null;
			}
		}
		else if (focusNode.right == null){
			
			if (focusNode == root)
				 root = focusNode.left;
			else if (isALeftChild)
				parent.leftChild = focusNode.leftChild;
			else parent.right = focusNode.left;
		}
		
		else if (focusNode.left==null){
			if (focusNode == root) root = focusNode.right;
			else if (isALeftChild)
				parent.left = focusNode.right;
			else parent.right = focusNode.left;
			else {
				Node replacement = getReplacementNode(focusNode);
				
				if (focusNode==root)
					root = replacement;
				else if (isALeftChild)
					parent.leftChild = replacement;
				else 
					parent.right = replacement;
				
				replacement.left = focusNode.left;
					
			}
		}
		
		return true;
	}
	
	public Node getReplacementNode (Node replacedNode){
		
		Node replacementParent = replacedNode;
		Node replacement = replacedNode;
		
		Node focusNode = replacedNode.right;
		
		while (focusNode != null){
			replacementParent = replacement;
			replacement = focusNode;
			focusNode = focusNode.left;
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		BinaryTree theTree = new BinaryTree();
		theTree.addNode(50, "Boss");
		theTree.addNode(25, "Vice Pres");
		theTree.addNode(15, "Officie Manager");
		theTree.addNode(30, "Secretary");
		theTree.addNode(85, "Salesman 1");
		
		System.out.println ("\n In order Traversal");
		theTree.inOrderTraverseTree(theTree.root);	
		System.out.println ("\n Pre order Traversal");
		theTree.preOrderTraverseTree (theTree.root);
			System.out.println ("\nPost order Traversal");
		theTree.postOrderTraverseTree (theTree.root);	

	}
	
	class Node {
		
		int key;
		String name;
		
		Node left;
		Node right;
		
		Node (int key, String name){
			this.key = key;
			this.name = name;
		}
		
		@Override
		public String toString(){
			return this.name + "has a key "+this.key;
		}
	}

}
