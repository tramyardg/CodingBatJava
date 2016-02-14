package warmup1;


/**
 * Created by RAYMART on 2016-02-11.
 */
public class SleepIn {
    public static void main (String[] args){
        System.out.println("we sleep in? " + sleepIn(true, true));
    }

    /**
     *
     * @param weekDay
     * @param vacation
     * @return
     */
    public static boolean sleepIn(boolean weekDay, boolean vacation) {
        //We sleep in if it is not a weekday or we're on vacation
        if(!weekDay || vacation == true){
           return true;
        }
        return false;
    }
}
