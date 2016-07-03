package recursion1;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class BunnyEars {

    public int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        return 2 + bunnyEars(bunnies - 1);
    }
    // say bunnies is 3
    // bunnies == 0 false
    // 2 + bunnyEars(3 - 1) =   [2] + bunnies(2) = 
    // bunnies == 0 false
    // 2 + bunnies 2 - 1 =      [2] + bunnies(1)
    // bunnies == 0 false
    // 2 + bunnies 1-1 =        [2] + bunnies(0)
    

}
