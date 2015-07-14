public class Ex4  {
	public static void main(String[] args) {
		String str = "mumbai";
		//Print the first character
		System.out.println(str.charAt(0));
		//Print the length
		System.out.println(str.length());
		//Print the last two characters
		System.out.println(str.substring(str.length() - 2));
		//Print the value in caps
		System.out.println(str.toUpperCase());
		//Print the characters in odd position.
		for(int i=0;i<str.length();i++){
			if(i%2 != 0)
				System.out.println(str.charAt(i));
		}
		String str2 = "hello how are you?";
		String[] tempArr = str2.split(" ");
		for(int i=0;i<tempArr.length;i++){
			System.out.println(tempArr[i]);
		}
	}
}