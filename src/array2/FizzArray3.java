package array2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class FizzArray3 {

    public int[] fizzArray3(int start, int end) {
       int lengthArray = end - start;
       int[] nums = new int[lengthArray];
       if(start < end) {
           for(int i = 0; i < lengthArray; i++) {
               nums[i] = start++;
           }
       } else {
           System.out.println("Invalid parameters. Start must be greater than end");
       }
       return nums;
       
    }
    
   

}
