package string1;

/**
 * Created by RAYMART on 2016-02-22.
 */
public class MakeOutWord {
    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "Yay"));
    }

    public static String makeOutWord(String a, String b) {
        String start = a.substring(0, 2);
        String end = a.substring(2);
        return start + b + end;
    }
}
