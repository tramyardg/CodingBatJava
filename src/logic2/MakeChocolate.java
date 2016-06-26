package logic2;

/**
 *
 * @author RAYMARTHINKPAD
 */
public class MakeChocolate {

    public int makeChocolate(int small, int big, int goal) {
		if(big*5+small==goal) {
			return small;
		}
		  // if(goal%5==0&&big*5+small>goal) {
		  //   return goal-5;
		  // }
		if(goal%5>small) {
			return -1;
		}
		if(big*5+small>goal) {
			return goal%5; 
		}
		return -1;	
	}


}
