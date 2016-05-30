package array2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class TwoTwo {

    public static boolean twoTwo(int[] nums) {
        boolean cond = false;
        if (nums.length == 1) {
            if (nums[0] != 2) {
                cond = true;
            }
        } else if (nums.length == 0) {
            cond = true;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            /**
             * if the last element of the
             * array is two and since we
             * cover only up to
             * the element before the last 
             * one
             */
            if (nums.length > 2 && nums[nums.length - 1] == 2) {
                cond = false;
            }
            if (nums[i] == 2) {
                if (nums[i + 1] == 2) {
                    cond = true;
                }
            }
        }
        /**
         * if there are no twos in the array
         * return false
         */
        if (countNum2(nums) < 1) {
            cond = true;
        }
        /**
         * if there are three 2s an the last index is not
         * equal to 2 then return false
         */
        if (countNum2(nums) == 3 && nums[nums.length - 1] != 2) {
            cond = false;
        } 
        return cond;
    }

    public static int countNum2(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 7, 2, 1}; // false
        System.out.println(twoTwo(nums));
    }

}
