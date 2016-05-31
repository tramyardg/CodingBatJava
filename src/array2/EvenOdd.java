package array2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class EvenOdd {

    public int[] evenOdd(int[] nums) {
        int evenFront = 0;
        int oddBack = nums.length - 1;
        int newArr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                newArr[evenFront++] = nums[i];
            } else {
                newArr[oddBack--] = nums[i];

            }
        }
        return newArr;
    }

}
