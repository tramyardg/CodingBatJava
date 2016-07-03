package recursion1;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class BunnyEars2 {
//    we have bunnies standing in a line, numbered 1, 2, ... 
    // The odd bunnies (1, 3, ..) have the normal 2 ears. 
    // The even bunnies (2, 4, ..) we'll say have 3 ears, 
    // because they each have a raised foot. Recursively 
// return the number of "ears" in the bunny line 1, 2, ... n 
    // (without loops or multiplication).

//bunnyEars2(0) → 0
//bunnyEars2(1) → 2
//bunnyEars2(2) → 5
    public int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        if(bunnies%2==0) {
            return 2 + Math.abs(bunnyEars2(bunnies - 3));
        } else {
            return 2 + bunnyEars2(bunnies - 2);
        }
        // bunnies = 2
        // bunnies == 0 : false
        // bunnies even = true
        // return 2 + bunnyEars(2 - 3) = 2 + bunnies:1
        
        
    }

}
