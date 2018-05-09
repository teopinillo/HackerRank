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
public class TheGridSearch {

    public static void main(String[] args) {
        //<---Borrar luego, solo de prueba
        //case 3
        //String [] G = {"1234567890","0987654321","1111111111","1111111111","2222222222"};
        //String[] P = {"11", "11"};
        
        //test case 4 = yes
        String[] G = {
            "7652157548860692421022503", "9283597467877865303553675",
            "4160389485250089289309493", "2583470721457150497569300",
            "3220130778636571709490905", "3588873017660047694725749",
            "9288991387848870159567061", "4840101673383478700737237",
            "8430916536880190158229898", "8986106490042260460547150",
            "2591460395957631878779378", "1816190871689680423501920",
            "0704047294563387014281341", "8544774664056811258209321",
            "9609294756392563447060526", "0170173859593369054590795",
            "6088985673796975810221577", "7738800757919472437622349",
            "5474120045253009653348388", "3930491401877849249410013",
            "1486477041403746396925337", "2955579022827592919878713",
            "2625547961868100985291514", "3673299809851325174555652",
            "4533398973801647859680907"};               
        String[] P = {"5250","1457","8636","7660","7848"};
        

        //case 2
        //String[] G = {"400453592126560", "114213133098692", "474386082879648", "522356951189169", "887109450487496", "252802633388782", "502771484966748", "075975207693780", "511799789562806", "404007454272504", "549043809916080", "962410809534811", "445893523733475", "768705303214174", "650629270887160"};
        //String[] P = {"99", "99"};

        //case 1
        //String [] G = {"1"};
        //String [] P = {"2"};
        
        //String [] G = {"5111","5111","1122","1122"};
        //String [] P = {"51","51"};
        
       // String [] G = {"123412","561212","123634","781288","999991"};
        //String [] P = {"12","34"};
        
        int C = G[0].length();  //<---Borrar luego
        int c = P[0].length();
        int R = G.length;
        int r = P.length;

        int xG, yG, yP, xP;
        xG = yG = yP = xP = 0;
        boolean found = false;
        
         //print the array
         for (int i=0;i<R;i++){
             for (int j=0;j<C;j++){
                 System.out.print( G[i].charAt(j) );
             }
             System.out.println("");
         }
         
         System.out.println("\n");
         
         char chG, chP;         
         while ( (yG<R) && (!found) ){ 
          chP = P[0].charAt(0);   
          while ( (yG<R) && ( G[yG].charAt(xG)!=chP )) {
                 xG++;
                 if (xG>=C){
                     xG=0;
                     yG++;
                 }                 
          }   
          
          //comprobar si la matriz se ajusta al espacio
          if (((xG+c-1)<C) && (yG+r-1<R)){
             System.out.println("found at: "+ xG + ", "+yG);  
             
             found = true;
             //check for every location
             for (int row=0;(found) && (row<r);row++){
                 for (int col=0;(found)&&(col<c);col++){
                     chP=P[row].charAt(col);
                     chG=G[yG+row].charAt(xG+col);
                     if (chP!=chG) found = false;
                 }
             }
             
             if ( found )System.out.println( "found matrix!" );
          }
          
          xG++;
          if (xG>=C){
                     xG=0;
                     yG++;
                 } 
        } 
         
        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
    }
}


