/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

/**
 *
 * @author tfrancisco
 */
public class Poles {

    public static void main(String[] args) {

        class Pole implements Comparable<Pole> {

            int alt;
            int weight;
            Pole prev;
            int cost;
            

            Pole(int i, int weight) {                
                alt = i;
                this.prev = null;
                this.weight = weight;
                this.cost = 0;
            }

            @Override
            public String toString() {
                String pre = "nul";
                if (prev != null) {
                    pre = String.valueOf(prev.alt);
                }
                return " alt: " + alt + " previo: " + pre + " weight: " + weight + " cost: " + cost;
            }

            @Override
            public int compareTo(Pole o) {
                return this.cost - o.cost;
            }

        }

        //Integer[] alt = {0, 2, 4, 6, 8};
        //int[] weight = {3, 105, 7, 9, 11};
        //Integer[] alt = {20, 30, 40};
        //int[] weight = {1, 1, 1};
        Integer[] alt = {10, 12, 16, 18, 30, 32};
        int[] weight = {15, 17, 18, 13, 10, 1};
        int stacks = 2;
        int minCost = 0;
        Pole currPole, prevPole;

        java.util.HashSet<Integer> stackSet = new java.util.HashSet<>();
        java.util.ArrayList<Pole> poles = new java.util.ArrayList<>();

        for (int i = 0; i < alt.length; i++) {            
            poles.add(new Pole(alt[i], weight[i]));
        }
        //setting the prev value & calculating cost
        for (int i = poles.size() - 1; i > 0; i--) {
            currPole = poles.get(i);
            prevPole = poles.get(i - 1);
            currPole.prev = prevPole;
            currPole.cost = getCost(currPole.weight, currPole.alt, prevPole.alt);
        }

        System.out.println("Printing all Poles");
        for (Pole p : poles) {
            System.out.println(p);
        }
        //sorting all poles by cost
        Collections.sort(poles);
        System.out.println("Printing all Poles sorted by cost");
        for (Pole p : poles) {
            System.out.println(p);
        }
        int step = 1;
        
        stackSet.addAll(Arrays.asList(alt));

        while (stackSet.size() > stacks) {
            //Los postes estan ordenados por coste 
            //de movimiento al proximo
            int i=0;
            while ((poles.get(i).cost==0))i++;
            currPole = poles.get(i);
            minCost += currPole.cost;            
            System.out.print(step + ": moving: " + currPole.alt + " down  w: " + currPole.weight + " cost: " + currPole.cost);
            step++;            
            
            prevPole = currPole.prev;       //get previous
            currPole.alt = prevPole.alt;
            if (prevPole.prev==null){
                currPole.prev = null;                
            } else {                
                currPole.prev = prevPole.prev;                                
            }
            //sorting by altitude            
            Collections.sort(poles, new Comparator<Pole>() {
                @Override
                public int compare(Pole o1, Pole o2) {
                    return o1.alt - o2.alt;
                }
            });
            //re-calculate cost
            for ( i = poles.size() - 1; i > 0; i--) {
            currPole = poles.get(i);
            prevPole = poles.get(i - 1);
            currPole.prev = prevPole;
            currPole.cost = getCost(currPole.weight, currPole.alt, prevPole.alt);
            }
            
            //set the satckSet again
            stackSet.clear();
            for (Pole p: poles){
                stackSet.add (p.alt);
            }
            /*
            
            System.out.println("\nPrinting all Pole by alt");
            for (Pole prt : poles) {
                System.out.println(prt);
            }
            //setting the prev value & calculating cost
            for (int j = poles.size() - 1; j > 1; j--) {
                currPole = poles.get(j);
                if (poles.get(j - 1).prev!=null) {
                   prevPole = poles.get(j - 1).prev;                
                    currPole.cost = getCost(currPole.weight, currPole.alt, prevPole.alt); 
                }else {
                    currPole.cost =0;
                }
                
            }
                    */
            //sorting the poles by moving cost
            Collections.sort(poles);
            
            System.out.println("\nPrinting all Pole by Moving Cost");
            for (Pole prt : poles) {
                System.out.println(prt);
            }
                      
            printStackSet(stackSet);
        }

        System.out.println("Min Cost: " + minCost);
    }

    private static int getCost(int w, int aHig, int aLow) {
        if (aLow > aHig) {
            return -1;
        }
        return w * (aHig - aLow);
    }

    private static void printStackSet(HashSet<Integer> stackSet) {
         System.out.print("\t\t altitudes: ");
            for (Integer prt : stackSet) {
                System.out.print(prt + " ,");
            }
            System.out.println();
    }
    

}
