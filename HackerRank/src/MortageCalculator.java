/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tfrancisco
 */
public class MortageCalculator {
    public static void main (String[] args){
        double loan = 292000-10200;
        int years = 30;
        double apr = 4.25;
        double aprMonthly = (apr/100) / 12;
        double loanMonthly = loan /(years*12);
        double paidToPrincipal = 785;
        double totalInterest=0;
        
        System.out.println("Principal monthly: "+loanMonthly);
        System.out.println("month \t\tLoan\t\tInterest\t\tPrincipal");
        //System.exit(0);
         for (int i=0;i<years*12;i++){
             double interest = loan * aprMonthly;
             totalInterest+=interest;
             System.out.printf("\n%d\t\t%10.2f\t\t%10.2f\t\t%10.2f",i,loan,interest,paidToPrincipal);
             loan-=(paidToPrincipal);
         }
         System.out.printf("\n\nTotal Interest paid: %10.2f",totalInterest);
    }
    
}
