

public class myRegex {
    //String pattern = "\\d{0,1}\\d{0,1}\\d{1}.\\d{0,1}\\d{0,1}\\d{1}.\\d{0,1}\\d{0,1}\\d{1}.\\d{0,1}\\d{0,1}\\d{1}";
    //String pattern = "(([0]{0,3}|[0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]).){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])";
    /*
    0{2,3}			: 00,000
\d{1,2}			: 0..99
0\d{1,2}		: 000..099
1\d\d			: 100..199
2[0-5][0-5]		: 200..255

(()\.){3}())
    */
    String pattern = "^(((((2[0-5][0-5])|(000)|(\\d{1,2})|([01]\\d\\d))\\.){3})(((2[0-5][0-5])|(0\\d\\d)|(000)|([01]\\d\\d)|(\\d{1,2}))))";
    
}
