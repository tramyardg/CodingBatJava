package array3;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class CanBalance {

    public boolean canBalance(int[] nums) {
        boolean cond = false;
        int div = 0;
        int leftSum = 0;
        int rightSum = 0;
        if (nums.length >= 2) {
            div = (int) Math.floor(nums.length / 2);
            for (int i = 0; i < div; i++) {
                leftSum += Math.abs(nums[i]);
            }
            for (int j = div + 1; j < nums.length; j++) {
                rightSum += Math.abs(nums[j]);
            }
            if (leftSum < rightSum) {
                leftSum = leftSum + nums[div];
            } else {
                rightSum = rightSum + nums[div];
            }
            if (rightSum == leftSum || leftSum + nums[nums.length - 2] == nums[nums.length - 1]) {
                cond = true;
            }
        }

        return cond;
    }

}
