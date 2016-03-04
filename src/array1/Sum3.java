package array1;

/**
 * Created by RAYMARTHINKPAD on 2016-03-04.
 */
public class Sum3 {
    public static void main(String[] args) {
        int[] arr = {7,0,0};
        System.out.println(sum3(arr));
    }

    public static int sum3(int[] nums){
        int t = 0;
        for(int i = 0; i < nums.length; i++){
            t = t + nums[i];
        }
        return t;
    }
}
