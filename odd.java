import java.util.Scanner;

public class odd {
	public static void main(String[]args) {
		int a;
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter a number : ");
		a = scan.nextInt();
		if( a % 2 == 0) {        
			System.out.println(a + " is a Even Number " );
		}

		else {
			System.out.println(a + " is a Odd Number ");
		}
	}
}