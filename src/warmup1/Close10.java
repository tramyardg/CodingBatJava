package warmup1;

/**
 * Created by RAYMART on 2016-02-13.
 */
public class Close10 {
    public static void main (String[] args) {
        System.out.println(close10(5,6));
    }

    public static int close10(int a, int b) {

        int resA = Math.abs(10-a);
        int resB = Math.abs(10-b);

        if(resA < resB){
            return a;
        }
        if(resB < resA) {
            return b;
        }
        return 0;
    }

}
