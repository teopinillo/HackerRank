
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tfrancisco
 */

/*
In a tag-based language like XML or HTML, contents are enclosed between a start
tag and an end tag like <tag>contents</tag>. Note that the corresponding end
tag starts with a /.

Given a string of text in a tag-based language, parse this text and retrieve
the contents enclosed within sequences of well-organized tags meeting the
following criterion:

    The name of the start and end tags must be same. The HTML code <h1>Hello
    World</h2> is not valid, because the text starts with an h1 tag and ends
    with a non-matching h2 tag.

    Tags can be nested, but content between nested tags is considered not
    valid. For example, in <h1><a>contents</a>invalid</h1>, contents is
    valid but invalid is not valid.

    Tags can consist of any printable characters.

*/
public class TagContentExtractor {
     public static void main (String[] args){
        String html = "<h1>content</h1><h3>whdfdbhfh</h3>";
        html = "<h1>Nayeem loves counseling</h1>";
        html = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";
        html ="<Amee>safat codes like a ninja</amee>";
        html ="<SA premium>Imtiaz has a secret crush</SA premium>";
        //html ="<h1>had<h1>public</h1515></h1>";
        
        String pattern;
        //pattern = "(?i)(<([ a-zA-Z0-9]*)>)([ A-Za-z]*)(<\\/\\2>)";
       pattern ="\\<(.+)\\>([^\\<\\>]+)\\<\\/\\1\\>";
        
            Pattern r = Pattern.compile (pattern);
            Matcher m = r.matcher (html);
            boolean found = false;
            
            while (m.find()){
                
                String content = m.group(2);
                if (content.isEmpty()){
                    found = false;
                }else{
                    System.out.println();
                    found = true;
                }
                
            }
            if (!found)System.out.println("None");
            
      }
}   
    

