package string2;

public class XYZmiddle {
	public static void main(String[] args) {
		
		String str = "xyzxyzAxyzBxyzxyz";
		

		int strLengthMinus1 = str.length() - 1;
		System.out.println("string length minus 1: " + strLengthMinus1);
		
		System.out.println(xyzMiddle(str));
	}

	public static boolean xyzMiddle(String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i)=='x'&&str.charAt(i+1)=='y'&&str.charAt(i+2)=='z') {
				count++;
			}
			
			
		}
		System.out.println("count: " + count);
		
		boolean cond = false;
		if(str.isEmpty() || str.length() <= 2) {
			return false;
		}
		String newStr  = str;
		
		
		if(str.length() > 9) {
			newStr = "";
			for(int i = 3; i < str.length()-3; i++) {
				
				newStr += String.valueOf(str.charAt(i));
				
			}
		}
		
		int strLengthMinus1 = newStr.length() - 1;
		
		int lastIndexOfx = newStr.lastIndexOf('x');
		int lastIndexOfz = newStr.lastIndexOf('z');
		
		int numBack = strLengthMinus1 - lastIndexOfz;
		int decidingFactor = Math.abs(lastIndexOfx - numBack);
		
		if(decidingFactor <= 1) {
			return true;
		}
		return false;
	}

}
