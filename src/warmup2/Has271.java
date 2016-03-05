package warmup2;

/**
 * Created by RAYMARTHINKPAD on 2016-03-04.
 */
public class Has271 {
    public static void main(String[] args){
        int[] arr = {1,6,2};
        System.out.println(has271(arr));
    }

    public static boolean has271(int[] nums) {
        for(int i = 0; i <= nums.length-1; i++ ) {
            if((i+2)>nums.length-1){
                return false;
            } else {
                int s = Math.abs(nums[i+1] - nums[i]);
                int d = Math.abs((nums[i+2])-(nums[i]-1));
                if ((s==5) && (d<=2)) {
                    return true;
                }
            }
        }
        return false;
        //(a,b,c)
        //if c - a <= 2 return true
        //a+5=b or b-a=5
        //a>0
        //Again:
        //  iterate < nums.length-2 so you can use i+1 and i+2
        //  in the loop
        /**
         * Another version
         */
        /*
        for(int j = 0; j < nums.length-2; j++) {
            int val = nums[j];

            if((nums[j+1]==(val+5))&&
                    (Math.abs(nums[j+2]-(val-1))<=2)){
                return true;
            }
        }
        return false;
        */
    }
}
