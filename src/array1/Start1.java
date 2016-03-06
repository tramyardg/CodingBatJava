package array1;

/**
 * Created by RAYMARTHINKPAD on 2016-03-06.
 */
public class Start1 {
    public static void main(String[] args) {
        int[] a = {7,2,3};
        int[] b = {1};
        System.out.println(start1(a,b));
    }

    public static int start1(int[] a, int[] b) {
        int one = 1;
        if(a.length>=one&&b.length==0){
            if(a[0]==one){
                return one;
            }
        } else if(b.length>=one&&a.length==0) {
            if(b[0]==one){
                return one;
            }
        }
        if(a.length>=one&&b.length>=one){
            if(a[0]==one&&b[0]==one){
                return one + 1;
            }else if(a[0]==one||b[0]==one){
                return one;
            }
        }
        return 0;
    }

}
