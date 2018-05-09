import java.util.ArrayList;
import java.util.List;

//showing only the answer, no the input

public class ClimbingLeaderboard {

    
	/*
	*https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
	* teopinillo May 05, 2018
	*/
	
	
	static int[] climbingLeaderboard(int[] scores, int[] alice) {
        
        List<Integer> ranges = new ArrayList<Integer>();
        
        int scoresLen = scores.length;
        int aliceLen = alice.length;
        int[]results = new int[aliceLen];
        //set the top boundary
        int topScore = scores[0]+alice[aliceLen-1];
        ranges.add(topScore);
         //setting the boundaries
         int previous = topScore;
          for (int s:scores){
              if (s!=previous) {
                  ranges.add(s);
                  previous = s;
          }
          }
        //setting the bottom range
        ranges.add(-1);
        
        //debugging
        //for (Integer i:ranges)
        //    System.out.print (i+" ");
        
        //loop over each alice score
        int rangeStart = ranges.size()-1;
        for ( int i=0;i<aliceLen;i++){
            for (int j=rangeStart;j>0;j--){
                if ((alice[i]>=ranges.get(j)) && (alice[i]<ranges.get(j-1))){
                    results[i]=j;
                    rangeStart=j;
                    break;
                }//if
            }//for j            
        }//for i        
        return results;
    }
	
}
