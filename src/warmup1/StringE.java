package warmup1;

/**
 * Created by RAYMART on 2016-02-13.
 */
public class StringE {
    public static void main(String[] args){
        System.out.println(stringE(""));
    }

    public static boolean stringE(String str) {
        if(str.length() <= 1) {
            if(str.equals("e")){
                return true;
            }
        } else {
            String char1to3 = str.substring(0, 3);
            if(char1to3.contains("e")) {
                return true;
            }
        }
        return false;


    }
}
