public class Strings {
	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = new String("Java");
		String str3 = "Java";
		String str4 = new String("Java");
		
		if(str1 == str2)
			System.out.println("str1 and str2 are equal");
		else
			System.out.println("str1 and str2 are not equal");
		
		if(str1.equals(str2))
			System.out.println("str1 and str2 are same");
		
	}
}