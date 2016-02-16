package warmup1;

/**
 * Created by RAYMART on 2016-02-15.
 */
public class DelDel {
    public static void main(String[] args) {
        System.out.println(delDel("adelco"));
    }

    public static String delDel(String str) {
        /*if(str.length()>=4) {
            if(String.valueOf(str.charAt(1)).equals("d")) {
                if(String.valueOf(str.charAt(1+1)).equals("e")) {
                    if(String.valueOf(str.charAt(1+1+1)).equals("l")) {
                        return str.substring(0,1) + str.substring(4, str.length());
                    }
                }
            }
        }*/

        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);
        }

        return str;
    }
}
