//https:www.hackerrank.com/challenges/balanced-brackets/problem

import java.util.*;

public class balanced_brackets {

    static String isBalanced(String s) {
        Deque<Character> q = new ArrayDeque<>();
        boolean cont;
        int l = s.length();
        if (l%2!=0) return "NO";
        for (int i=0;i<l;i++){
            char ch = s.charAt(i);
             //open Brackets
            if ((ch=='{') | (ch=='[') | (ch=='(') ) {
                q.offerFirst(ch);
            }else {
                //every character in the sequence will be a bracket
                //so if is not an opening then is a close bracket
                if (q.isEmpty()) return "NO";
                char saved = q.pollFirst();
                cont = false;
                 if ( (saved=='{') && (ch=='}') ) cont = true;
                 if ( (saved=='(') && (ch==')') ) cont = true;
                 if ( (saved=='[') && (ch==']') ) cont = true;
                 if (!cont) return "NO";
            }
        }
        if (q.isEmpty()) return "YES";
         else return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}