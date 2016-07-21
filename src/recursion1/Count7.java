package recursion1;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class Count7 {
    
//    count7(717) → 2
//    count7(7) → 1
//    count7(123) → 0
    public static void main(String[] args) {
        System.out.println(count7(777));
    }

    public static int count7(int n) {
        if(String.valueOf(n).length()==1&&n==7) { return 1; }
        
        int mod = n%10;
        if(mod == 7) {
            return 1 + count7(n-mod /10);
        }
        return 1 + count7(n % 10);
    }

}
