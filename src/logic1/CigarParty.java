package logic1;

/**
 * Created by RAYMART on 2016-02-29.
 */
public class CigarParty {
    public static void main(String[] args) {
        System.out.println(cigarParty(30, false));
    }

    /**
     * @param n         number of cigars smoked
     * @param isWeekend is week end
     * @return return
     * cigarParty(F,F) -> false
     * cigarParty(T,F) -> true
     * cigarParty(T,T) -> true
     */
    public static boolean cigarParty(int n, boolean isWeekend) {
        if ((n < 40) && (isWeekend == true || isWeekend == false)) {
            return false;
        }
        if ((n >= 40 && n <= 60) && (isWeekend == true || isWeekend == false)) {
            return true;
        }
        if ((n > 60) && isWeekend == false) {
            return false;
        }
        if ((n > 60) && isWeekend == true) {
            return true;
        }
        return false;
    }
}
