package logic1;

/**
 * Created by RAYMART on 2016-02-22.
 */
public class CaughtSpeeding {
    public static void main(String[] args) {
        System.out.println(caughtSpeeding(60, true));
    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        /**
         * Important:
         *      Unless it is your birthday -- on that day,
         *      your speed can be 5 higher in all cases.
         *
         */
        if (isBirthday) {
            speed = speed - 5;
        }
        if (speed <= 60) {
            return 0;
        }
        return (speed >= 61 && speed <= 80) ? 1 : 2;
    }
}
