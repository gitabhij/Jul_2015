public class Strings2  {
	public static void main(String[] args) {
		
		String str = "";
		
		for(int i=0;i<100;i++){
			str += i + ", ";
		}
		System.out.println(str);
		
		String str1 = "Java";
		String str2 = "Java";
		
		str1 += " is widely used.";
		
		System.out.println(str1);
		System.out.println(str2);
		
		str2 = "Ruby";
		str2 = "Confused";
	}
}