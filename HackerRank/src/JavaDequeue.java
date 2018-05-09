/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author tfrancisco
 */
public class JavaDequeue {
    public static void main(String[] args) {
            
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<>();
            HashSet<Integer> unique = new HashSet <>();
            
            int n = in.nextInt();
            int m = in.nextInt();
            int maxU = m;
            int fNum;
            
            if (m>1) {
                maxU=0;
                for (int i = 0; i < n; i++) {

                    int num = in.nextInt();
                    deque.add (num);
                    unique.add(num);
                    
                     if (deque.size()==m){
                         //unique = new HashSet (deque);
                         if (unique.size()>maxU) maxU = unique.size();
                         fNum = deque.removeFirst(); 
                         unique.remove(fNum);
                     }
                    
                }
            }
            System.out.println (maxU);
        }
    
}
