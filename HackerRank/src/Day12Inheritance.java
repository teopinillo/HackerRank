//https://www.hackerrank.com/challenges/30-inheritance
public class Day12Inheritance {
	
	class Person {
		protected String firstName;
		protected String lastName;
		protected int idNumber;
		
		Person (String firstName, String lastName, int identification){
			this.firstName = firstName;
			this.lastName = lastName;
			this.idNumber = identification;
		}
		
	}
	
	class Student extends Person {
		
		int[] testScores;
		
		Student (String fName, String lName, int id, int[] testScores){			
			super (fName, lName, id);			
			this.testScores = testScores;
		}
		
		char calculate() {
			int c=0;
			
			for (Integer i:testScores) c+=i;
			c/=testScores.length;
			if (c>=90) return 'O';
			if (c>=80) return 'E';
			if (c>=70) return 'A';
			if (c>=55) return 'P';
			if (c>=40) return 'D';
			return 'T';
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
