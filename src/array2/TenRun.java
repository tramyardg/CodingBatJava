package array2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class TenRun {

    public int[] tenRun(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            // if the number is not equal 10
            // go to the next index directly
            if (nums[i] % 10 == 0) {
                /**
                 * if you are here this means your current index is multiple by
                 * 10 then if the next index is not multiple by 10, assigned the
                 * next index equal to the current number (multiple by 10)
                 *
                 * example: [2, 10, 3, 4, 20, 5, 1] here the first mutiple by 10
                 * is at index 1 the next number is 3 at index 2 this is NOT
                 * mutiple by 10 so while it is not multiple by 10 then make the
                 * next number equal to the (previous) number
                 */
                while (nums[i + 1] % 10 != 0) {
                    // if you are here, this means you are
                    // going to make the next number equal
                    // to the previous number

                    // when you make the next number equal to the 
                    // previous number, that number is now multiple
                    // by 10
                    // then you increment your index
                    // which is the previous is always multiple by 10
                    // example
                    // nums is now [2, 10, 10, 4, 20, 5, 1]
                    // notice the index 2 is now 10
                    // your index is now 2
                    nums[i + 1] = nums[i];

                }
            }

        }
        return nums;

    }

}
