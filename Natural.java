import java.util.Scanner;

public class Natural {
	public static void main(String[]args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter a number : ");
		num = scan.nextInt();
		for(int i = 1; i <= num; ++i) {
			if(num >= i) {
				System.out.print(i);
				System.out.print(" ");
			}
		}
	}
}