package array2;

import java.util.ArrayList;
/**
 *
 * @author RAYMARTHINKPAD
 */
public class WithoutTen {

    public int[] withoutTen(int[] nums) {
        int[] newArr = new int[nums.length];
        ArrayList<Integer> arrList = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                // store only the non-10 numbers
                arrList.add(nums[i]);
            }
        }
        for(int i = arrList.size(); i < nums.length; i++) {
            // add zeros to make the new array equal to the old one
            arrList.add(0);
        }
        for(int i = 0; i < nums.length; i++) {
            // convert the array list into an int array
            newArr[i]=arrList.get(i);
        }
        return newArr;
    }
}
