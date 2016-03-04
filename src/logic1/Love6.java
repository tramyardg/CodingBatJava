package logic1;

/**
 * Created by RAYMARTHINKPAD on 2016-03-04.
 */
public class Love6 {
    public static void main(String[] args) {
        System.out.println(love6(4,10));
    }

    public static boolean love6(int a, int b){
        int s = a + b;
        int d = a - b;
        if((a==6 || b==6)||(s==6)||(Math.abs(d)==6)){
            return true;
        }
        return false;
    }
}
