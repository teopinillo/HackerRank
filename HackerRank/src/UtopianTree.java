/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/**
 *
 * @author tfrancisco
 */
public class UtopianTree {
    public static void main (String args[]){
        int n=4;
        int cicle = n;
        int h=1;
        do{
           if ((cicle-- >0)){
               h*=2;               
           } 
           if ((cicle-- )>0) {
               h++;
            }
        }while(cicle>0);
        System.out.println(h);
    }
}
