package string1;

/**
 * Created by RAYMART on 2016-02-22.
 */
public class HelloName {
    public static void main(String[] args) {
        System.out.println(helloName("Bob"));
    }

    public static String helloName(String str) {
        return "Hello " + str + "!";
    }
}
