package warmup1;

/**
 * Created by RAYMART on 2016-02-13.
 */
public class LoneTeen {
    public static void main(String[] args) {
        System.out.println(loneTeen(66,18));
    }

    public static boolean loneTeen(int a, int b) {

        if((a >= 13 && a <= 19)) {
            if(b >= 13 && b <= 19){
                return false;
            }
            if(b < 13 || b > 19) {
                return true;
            }
        }
        if((b >= 13 && b <= 19)) {
            if(a >= 13 && a <= 19){
                return false;
            }
            if(a < 13 || a > 19) {
                return true;
            }
        }


        return false;
    }

}
