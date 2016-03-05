package warmup2;

/**
 * Created by RAYMART on 2016-02-17.
 */
public class Array123 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 1};
        int[] data =  {5, 2,1,2,3,5,8,10,6,7};
    int[] data2 = {2,2,4,5,1,2,3};
        System.out.println(array123(arr));
    }

    public static boolean array123(int[] a) {
        /**
         *  Very important:
         *       Note: iterate < length-2, so can use i+1 and i+2 in the loop
         */
        if (a.length >= 3) {
            // -2 prevents index out of bounds
            for (int i = 0; i <= a.length - 2; i++) {
                if (a[i] == 1) {
                    if (a[i + 1] == 2) {
                        if (a[i + 2] == 3) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    /*
    public static boolean array123 (int[] a) {
 // Note: iterate < length-2, so can use i+1 and i+2 in the loop
//  for (int i=0; i < (nums.length-2); i++) {
//    if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) return true;
//  }
//  return false;    
    
   boolean isTrue = false;
   int maxIndex =  a.length;
   int correctValue = 1;
   int biggestNumber = 4;
   
   for (int i=0; i < a.length; i ++) {
       if (a.length < biggestNumber) break;  // check array length size
       
       if ((i == a.length-1) && a[i] < biggestNumber) {  // check the last array content
           isTrue = false;
           break;
       
       }
       if (a[i] == correctValue) {
            if (biggestNumber == a[i]) {
               break;
            }
            isTrue = true;
            correctValue++;
            
       } else {
            isTrue = false;
            correctValue = a[i] +1;
       }
   }
   return isTrue;
}
    */
}
