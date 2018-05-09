//https://www.hackerrank.com/challenges/30-more-exceptions

public class Day17MoreExceptions {
	
	public int power (int n, int p) throws Exception{
		if ((n<0)&&(p<0)) {
			throw new Exception("a and p should be non-negative");
		}
		return (int)Math.pow(n, p);
		
	}

	public static void main(String[] args) {
		

	}

}
