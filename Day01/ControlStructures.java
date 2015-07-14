import java.util.Scanner;

public class ControlStructures {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String str = sc.next();	
		System.out.println("Hello " + str);
		for(int k=0;k<10;k++){
			System.out.println("What the hell is going on?");
		}
		int a = 0;
		while(a < 5){
			System.out.println("I'm scratching my head");
			a++;
		}
		int i = 10;
		System.out.println(i);
		boolean b = false;
		System.out.println(b);
		double d = 12.34;
		System.out.println(d);
		if(d == 12)
			System.out.println("d is 12");
		else
			System.out.println("d is not 12. It's " + d);
	}
}