package warmup1;

/**
 * Created by RAYMART on 2016-02-12.
 */
public class NearHundred {
    public static void main(String[] args){
        System.out.println(nearHundred(110));
    }

    public static boolean nearHundred(int n) {
        if((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10)) {
            return true;
        }
        return false;
        /*
        int num100 = Math.abs(100 - n); //100 - 89 = 11
        int num200 = Math.abs(200 - n);
        System.out.println("---> " + num100);
        if((num100 >= 0 && num100 <= 10) || (num200 >= 0 && num200 <= 10)) {
            return true;
        }
        return false;*/


    }

}
