//https://www.hackerrank.com/challenges/30-class-vs-instance
public class Person {

	private int age;	
	  
	public Person(int initialAge) {
  		
		if (initialAge>=0){
			age=initialAge;
		}else{
			System.out.println("Age is not valid, setting age to 0.");
		}
	}

	public void amIOld() {
		String ans = "old.";
		if (age<13) ans="young.";
		if ((age>=13)&&(age<18)) ans = "a teenager.";
  		
        System.out.println("You are "+ans);
	}

	public void yearPasses() {
  		age++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
