
public class Gamming {

	
	
	public static void main(String[] args) {
		
		Gamming myApp = new Gamming();
		int[] stacks = {4,4,5};
		assert myApp.xorSum (stacks,0)==1;
		assert myApp.pokeStone (stacks,2)==1;
		
		//int cuSt; //current stack
		//int exSt=0; //exclude stack		
		//loop over all stacks
		//for (int s=0;s<stacks.length;s++){			
			//for (int stone=stacks[s];stone>0;stone--){				
			//}
		//}
		
		

	}
	
	public long pokeStone (int[] stacks, int cuSt){
		//prex xor for al the stack that
		//doesnt change
		long zeroXor=0;
		long preXor = xorSum (stacks, cuSt);
		for (int stone=stacks[cuSt];stone>=0;stone--){			
			if ((stone^preXor)==0) zeroXor++;
		}
		return zeroXor;
	}
	
	public long xorSum (int[] stacks, int except){
		long r=0;
		for (int i=0;i<stacks.length;i++){
			if (i!=except){
				r=r^stacks[i];
			}
		}
		return r;
	}

}
