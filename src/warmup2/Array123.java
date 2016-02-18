package warmup2;

/**
 * Created by RAYMART on 2016-02-17.
 */
public class Array123 {
    public static void main(String[] args) {
        //int[] arr = {1, 1, 2, 1, 2, 3};
        int[] arr = {1, 1, 2, 1, 2, 3};
        //          (0, 1, 2, 3, 4, 5)
        //pos[1] = (0,1,3) position of 1 in the list
        //       = (0,1,3) + 1
        //       = (1,2,4)
        //pos[2] = (2,4)
        System.out.println(array123(arr));
        System.out.println(arr.length);


    }

    public static boolean array123(int[] a) {
        /**
         *  Very important:
         *       Note: iterate < length-2, so can use i+1 and i+2 in the loop
         */
        if (a.length >= 3) {
            for (int i = 0; i <= a.length - 2; i++) {
                if (a[i] == 1) {//a[0]->1
                    if (a[i + 1] == 2) {//1
                        if (a[i + 1 + 1] == 3) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
