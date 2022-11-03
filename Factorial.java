import java.util.Scanner;

public class Factorial {
	public static void main(String[]args) {
		int i , f = 1 , n;
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter a number : ");
		n = scan.nextInt();

		for( i = 1; i<=n; i++) {
			f = f*i;
		}

		System.out.println("Factorial of " + n + " is : " + f);
	}
}