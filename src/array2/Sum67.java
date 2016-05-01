package array2;


/**
 *
 * @author RAYMARTHINKPAD
 */
public class Sum67 {

    public int sum67(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            // this applies to a 67 pattern only
            // if a number that is 6 is succeeded 
            // by 7 immediately then run this if
            // otherwise run the else statement
            if (nums[i] == 6 && nums[i + 1] == 7) {
                nums[i] = 0;
                nums[i + 1] = 0;
            } else if (nums[i] == 6) {
                // only works when the sequence starts 
                // with 0, a number that starts with
                // 7 is left untouched
                // while the next number is not 7
                // move to the next element 
                // initializing that element to
                // zero, repeat this until
                // 7 is found
                // [1, 6, 4, 3, 3, 7, 2]
                // [1, 0, 0, 0, 0, 7, 2]
                while (nums[i + 1] != 7) {
                    nums[i] = 0;
                    nums[i + 1] = 0;
                    i++;
                }
                // the array is left with 7
                // to initialize to 0
                while (nums[i + 1] == 7) {
                    nums[i + 1] = 0;
                }
            }
            count += nums[i];
        }

        return count;
    }

}
