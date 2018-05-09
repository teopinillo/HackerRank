//https://www.hackerrank.com/challenges/game-of-stones-1?h_r=internal-search


public class GameOfStone {
	
	class Play {
		int stones;
		int player;
		Play st2;
		Play st3;
		Play st5;
		
		Play (int p, int st){
			stones = st;
			player = p;
			st2 = null;
			st3 = null;
			st5 = null;
			int nxtP;
			if (p==1) nxtP=2; else nxtP=1;
			 	  st2 = new Play (nxtP,st-2);
				  st3 = new Play (nxtP,st-3);
				  st5 = new Play (nxtP,st-5);				 
			 }
		}
		
		public void Play() {
			// TODO Auto-generated constructor stub
		}

		public int roll (int p, int st) {
			int w = winner (p, st);
			 if (w>0) return w;
			  
			  st5 = new Play (nxtP,st-5);
			  st3 = new Play (nxtP,st-3);
			  st2 = new Play (nxtP,st-2);
			  return 0;
		}
	}
	
	static int winner (int p, int st) {	
		 if (p==2){
			 if (st == 5) return 2; 
			 if (st == 4) return 2; 
			 if (st == 3) return 2; 
			 if (st == 2) return 2;
			 if (st == 1) return 1; else return 2;
		 }
		 
		 if (p==1){
			 if (st == 5) return 1; 
			 if (st == 4) return 1; 
			 if (st == 3) return 1; 
			 if (st == 2) return 1;
			 if (st == 1) return 2;
		 }
		 return 0;
    }
	
	public static void main(String[] args) {
		GameOfStone g = new GameOfStone();
		Play inicio = g.new Play(1,5);
		
		System.out.println(winner (1,5));
	}

}
