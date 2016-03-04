package logic1;

/**
 * Created by RAYMARTHINKPAD on 2016-03-04.
 */
public class More20 {
    public static void main(String[] args){
        System.out.println(more20(61));
    }

    public static boolean more20(int a){
        if((a%20==1)||(a%20==2)) {
            return true;
        }
        return false;
    }
}
