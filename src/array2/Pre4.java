package array2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class Pre4 {

    public int[] pre4(int[] nums) {
        int index4 = this.getIndex4(nums);
        int[] newArray = new int[index4];
        for(int i = 0; i < index4; i++) {
            newArray[i] = nums[i];
        }
        return newArray;
    }
    
    public int getIndex4(int[] nums) {
        int index4 = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i]==4) {
                index4 = i;
                break; //stop the array to get the first 4
            }
        }
        return index4;
    }

}
