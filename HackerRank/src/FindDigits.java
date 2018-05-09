

/**
 *
 * @author tfrancisco
 */
public class FindDigits {
    
    static public void main (String [] args){
        int n = 1012;
        int m;
        int o=n;
        int even = 0;
        
        while (n>0){
            m = n % 10;
            n/=10;            
            if ((m>0) && (o%m==0)) even++;
        }
        System.out.println(even);
    }
}
