package string2;

public class XYZmiddle {
	public static void main(String[] args) {
		
		String str = "xyzxyzAxyzBxyzxyz";
		

		int strLengthMinus1 = str.length() - 1;
		System.out.println("string length minus 1: " + strLengthMinus1);
		
		System.out.println(xyzMiddle(str));
	}

	public static boolean xyzMiddle(String str) {
		
		boolean cond = false;
		if(str.isEmpty() || str.length() < 2) {
			return false;
		}
		String newStr  = str;
		if(str.length() > 9 && str.substring(0,3).equals("xyz") && str.substring(str.length()-3, str.length()).equals("xyz")) {
			newStr = "";
			for(int i = 3; i < str.length()-3; i++) {
				
				newStr += String.valueOf(str.charAt(i));
				
			}
		}
		
//		System.out.println(newStr);
		
		int strLengthMinus1 = newStr.length() - 1;
		
		int lastIndexOfx = newStr.lastIndexOf('x');
		int lastIndexOfz = newStr.lastIndexOf('z');
		
		int numBack = strLengthMinus1 - lastIndexOfz;
		int decidingFactor = Math.abs(lastIndexOfx - numBack);
		
//		System.out.println("lastIndexOfx: "+ lastIndexOfx);
//		System.out.println("lastIndexOfz: "+ lastIndexOfz);
//
//		System.out.println("deciding number <= 1: " + decidingFactor);
		
		if(decidingFactor <= 1) {
			return true;
		}
		return false;
	}

}
