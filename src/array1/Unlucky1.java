package array1;

/**
 * Created by RAYMARTHINKPAD on 2016-03-03.
 */
public class Unlucky1 {
    public static void main(String[] args) {
        int[] arr = {1,3,1};
        System.out.println(unlucky1(arr));
    }

    public static boolean unlucky1(int[] nums) {
        if(nums.length >= 2) {
            if((nums[0]==1&&nums[1]==3)){
                return true;
            }
            if((nums[1]==1&&nums[2]==3)){
                return true; 
            }
            if((nums[nums.length-2]==1)&&((nums[nums.length-1]==3))) {
                return true;
            }
        }
        return false;

    }
}
