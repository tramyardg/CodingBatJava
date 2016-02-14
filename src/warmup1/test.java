package warmup1;

/**
 * Created by RAYMART on 2016-02-12.
 */
public class test {
    public static void main (String[] args) {
        String str = "Miracle";
        for(int i = 0; i < str.length(); i++) {
            if((i%2)==0) {
                System.out.println(str.charAt(i));
            }
        }
    }
}


