package warmup1;

/**
 * Created by RAYMART on 2016-02-14.
 */
class SumDouble {
    public static void main(String[] args) {
        System.out.println(sumDouble(2, 2));
    }


    public static int sumDouble(int a, int b) {
        /*if(((a<b)&&(b>a))||((a>b)&&(b<a))) {
            return a + b;
        }
        return 2*(a + b);
        */
        // Different approach
        int sum = a + b; // first go here
        // then checks if a and b is equal
        // if not then return the sum directly
        if (a == b) { //
            sum = sum * 2;
        }
        return sum;
    }
}
