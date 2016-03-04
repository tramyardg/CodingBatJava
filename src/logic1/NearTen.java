package logic1;

/**
 * Created by RAYMARTHINKPAD on 2016-03-04.
 */
public class NearTen {
    public static void main(String[] args){
        System.out.println(nearTen(19));
    }

    public static boolean nearTen(int n) {
        int r = n%10;
        int d;
        if(r>=0&&r<=2){
            return true;
        }
        d = r-10;
        if((Math.abs(d)>=0)&&(Math.abs(d)<=2)){
            return true;
        }
        return false;
    }
}
