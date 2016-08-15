package string1;

public class Middle2 {
	public static void main(String[] args) {
		String str = "stringg";
		System.out.println(middleTwo(str));
	}
	
	public static String middleTwo(String str){
		if(str.length()%2!=0) {
			return "Please enter an even length word." + "\nThe length of your string is " + str.length() + ".";
		}
		int strLenDiv2 = str.length()/2;
		String middle2 = str.substring(strLenDiv2-1, strLenDiv2+1);
		
		return middle2;
		
	}
}
