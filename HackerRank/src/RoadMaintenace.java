import java.util.*;

public class RoadMaintenace {

	protected class Road {
		int st;
		int end;
		int id;

		Road(int start, int end, int id) {
			st = start;
			this.end = end;
			this.id = id;
		}

		int getEnd() {
			return end;
		}

		int getStart() {
			return st;
		}

		@Override
		public String toString() {
			return "(" + id + ")[" + st + " , " + end + "]";
			//return st + " , " + end;
			//return  ""+id;
		}

		@Override
		public boolean equals(Object o) {
			Road other = (Road) o;
			if ((this.st == other.getStart()) && (this.end == other.getEnd()))
				return true;
			return false;
		}

		public int getId() {			
			return id;
		}	

	}

	public boolean isNewPath(ArrayList<ArrayList<Road>> alls, ArrayList<Road> n) {

		for (int i = 0; i < alls.size(); i++) {
			ArrayList<Road> roads = alls.get(i);
			if (roads.size() == n.size()) {
				// chk one by one the elements in both arrays
				boolean idem = true;
				for (int j = 0; j < roads.size(); j++) {
					if (roads.get(j) != n.get(j)) {
						idem = false;
						break;
					}
				}
				if (idem)return false;
			}
		}
		return true;
	}
	
	public boolean isUnique (ArrayList<Road> r1, ArrayList<Road> r2){
		for ( Road r:r1){
			if (r2.contains(r)) return false;			
		}
		return true;
	}

	public void printMatrix(int[][] m){
		for (int[] l:m){
			System.out.print("[");
			for ( int i:l) {
				System.out.print(i+" ");
			}
			System.out.println("]");
		}
	}
	
	public int[] countEmpty (int[][] m,int rows, int cols){
		int [] result = new int [cols];		
		 for (int col =0; col < cols; col ++){	
			 int c=0;
			  for (int row=0; row < rows; row++){
				 if( m[row][col]==0) c++;
			  }
			  result[col]=c;
		 }
		 return result;		 
	}
	
	public static void main(String[] args) {

		int roadId = 0;
		// ArrayList <ArrayList<Integer>> paths = new ArrayList<>();
		ArrayList<Road> roads;
		ArrayList<ArrayList<Road>> paths = new ArrayList<>();
		//int[] test = { 1, 2, 1, 3, 2, 3, 3, 4, 4, 5, 5, 6, 4, 6 };
		//int[] test = { 4,2,1,2,2,3,2,4 };
		int[] test = {1,2,2,3,3,4,4,5,5,6,6,7};
		RoadMaintenace rM = new RoadMaintenace();

		for (int i = 0; i < test.length;) {
			int p1 = test[i++];
			int p2 = test[i++];
			
			//search the first point in every route point
			
			//for every path
			for ( ArrayList<Road> rL:paths){
				//for every point in the path
				for ( Road r:rL){
					//if the exit is the same
					if (r.getEnd()==p1){
						//creates a new path
						ArrayList<Road> newPath = new ArrayList<>();
						newPath.addAll(rL);
						//and add this point
					}
				}
			}

			for (int j = 0; j < paths.size(); j++) {
				roads = paths.get(j);
				// si el ultimo elemento del camino es
				// mi comienzo entonces agrego el nuevo final.
				if (roads.get(roads.size() - 1).getEnd() == p1) {
					ArrayList<Road> newPath = new ArrayList<>();
					newPath.addAll(roads);					
					newPath.add(rM.new Road(p1, p2, roadId));
					// chequear que no este ya agregado
					if (rM.isNewPath(paths, newPath)){
						paths.add(newPath); 
						break;
					}
				}
				
				//si el primer elemento del nuevo camino
				// es el primer elemento de una ruta ya establecida
				//entonces se puede hay comunicacion desde el ultimo elemento 
	            //del nuevo camino hasta el ultimo elemento de la ruta ya establecida
				//y se crea una nueva ruta.
				if (roads.get(0).getStart()==p1){
					ArrayList<Road> newPath = new ArrayList<>();
					//agrego la nueva ruta al principio
					newPath.add( rM.new Road(p2,p1,roadId));
					newPath.addAll(roads);
					if (rM.isNewPath(paths, newPath))
						paths.add(newPath); 
					
				}
			}

			// agrego la ultima ruta entrada
			roads = new ArrayList<>();
			roads.add(rM.new Road(p1, p2, roadId));
			paths.add(roads);
			roads = new ArrayList<>();
			roads.add(rM.new Road(p2, p1, roadId++));
			paths.add(roads);

		}
		
		// imprimo los caminos que voy obteniendo
		for (int j = 0; j < paths.size(); j++) {
			roads = paths.get(j);
			System.out.println(j+": "+ roads);

		}
		System.out.println("------------------------------------------");
		
		
		//Eliminar las rutas que sean iguales
		HashSet<ArrayList<Integer>> uPaths = new HashSet<>();
		for (ArrayList<Road> rl:paths){
			ArrayList<Integer> iList = new ArrayList<>();
			for ( Road r:rl){
				iList.add(r.getId());
			}
			uPaths.add(iList);
		}
		
		//Eliminar las rutas que tengan menos de M caminos
		
		System.out.println("All possible routes:");
		//print the uPaths
		for (ArrayList<Integer> i:uPaths){
			System.out.println (i);
		}
		System.exit(0);
		//buscar cuantas rutas no contiene las
		
		int d = paths.size();
		int[][] intersections = new int [d][roadId];
		 for (int row =0; row<paths.size();row++){
			 roads = paths.get(row);
			 
			  for (int col=0;col<roads.size();col++){
				  intersections[row][roads.get(col).getId()]=1;
			  }
		 }
		 
		 rM.printMatrix(intersections);
		 int[] comb = rM.countEmpty(intersections,d,roadId);
		  for (int i:comb) System.out.print(i+" ,");
		 
		 
	}

}
