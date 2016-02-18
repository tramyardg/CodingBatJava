package warmup2;

/**
 * Created by RAYMART on 2016-02-16.
 */
public class Last2 {
    public static void main(String[] args) {
        System.out.println(last2("hhhh"));
    }

    public static int last2(String str) {
        for (int i = 0; i < str.length() - 1; i += 2) {
            //(0,1)(1,2)(2,3)
            System.out.println(i);
            if (str.charAt(i) == str.charAt(i + 1)) {
                /*if(str.charAt(i+1+1)==str.charAt(i+1+1+1)) {
                    System.out.println("hi");
                }*/
                //System.out.println("hi");
            } else {
                System.out.println("hello");
            }
        }
        return 0;
    }
}
