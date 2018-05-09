import java.util.Scanner;

public class LibraryFine {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int eDay, eMonth, eYear;		//expected day. month, year
		int aDay, aMonth, aYear;		//actual day. month, year
		 
		 
		 aDay = sc.nextInt();
		 aMonth = sc.nextInt();
		 aYear = sc.nextInt();
		 
		 eDay = sc.nextInt();
		 eMonth = sc.nextInt();
		 eYear = sc.nextInt();
		 
		 int fine=0;
		 if ((eMonth==aMonth)&&(aDay>eDay)){
			 fine = (aDay-eDay)*15;
		 }
		 if (aMonth>eMonth){
			 fine = (aMonth-eMonth)*500;
		 }
		 
		 if (aYear>eYear){
			 fine = 10000;			 
		 }
		 if (aYear<eYear) fine =0;
		 
		 System.out.println(fine);
		 //System.out.println (eDay+"/"+eMonth+"/"+eYear+"/"+aDay+"/"+aMonth+"/"+aYear);
		 //9 6 2016   6 6 2016
	}

}
