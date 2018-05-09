/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tfrancisco
 */
public class MelodiousPassword {
    
    public static void main(String[] args) {
      String consonants[]={"b","c","d","f","g","h","j","k",
        "l","m","n","p","q","r","s","t","v","w","x","z"};
       String vowels[]={"a","e","i","o","u"};
       String allVowels="aeiou";
       String [] singles=new String[consonants.length+vowels.length];
       String [] pairs = new String[consonants.length*vowels.length]; 
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ii=0;
        for (int i=0; i<consonants.length;i++){
            singles[ii++]=String.valueOf(consonants[i]);            
        }
        for (int i=0; i<vowels.length;i++){
            singles[ii++]=String.valueOf(vowels[i]);            
        }
        
        
        java.util.ArrayList<String> pass = new ArrayList<>();
        
        for (String c : consonants){                   
                    pass.add(c);
        }
        for (String v : vowels){                   
                    pass.add(v);
        }
        int l=1;
        ii=0;       
        String p;
        ArrayList <String> newPass = new ArrayList<>();
        while (l<n){
            p=pass.get(ii);
            int pl = p.length();
            String lchar = String.valueOf(p.charAt(pl-1));
            //si el ultimo carcater es una vocal
            //le agrega una consonante
            //pass.remove(ii);//borro esta entrada 
            if (allVowels.contains(lchar)){                
                
                for (String c:consonants){
                    newPass.add(p+c);
                }
                
            }else{
                //si es una consonante le agrego las vocales
                for (String v:vowels){
                    newPass.add(p+v);
                }
            }
            ii++;
            //si llego al fon de la lista:
            
            if (ii==pass.size()){
                l++;//1-incrementa el tamanno
                pass.clear(); //2-borra las antiguas
                pass.addAll(newPass); //3-pone las nuevas
                newPass.clear(); //bora el listado viejo
                ii=0;
            }
        }
        for (String ep:pass){
            System.out.println(ep);
        }
    }
    
}
