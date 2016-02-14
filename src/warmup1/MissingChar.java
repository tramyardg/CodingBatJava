package warmup1;

/**
 * Created by RAYMART on 2016-02-12.
 */
public class MissingChar {
    public static void main(String[] args){
        System.out.println(missingChar("kitten", 4));
    }

    /*
    given a non empty string and an int n,
    return a new string where the char at n has been removed

    kitten remove index 1 = ktten
     */
    public static String missingChar(String str, int i) {
        String first = str.substring(0, i);
        String second = str.substring(i+1, str.length());


        return first + second;
    }

}
