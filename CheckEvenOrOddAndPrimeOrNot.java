/*public class CheckEvenOrOddAndPrimeOrNot {
	public static void main(String[]args) {
        int number = 2;
		int temp;
		boolean isPrime =true;

		for(int i = 2; i <= number / 2; i++) {
			temp = number % i;
			if(temp == 0) {
				isPrime = false;
				break;
			}
		}

		if(isPrime) System.out.println(number + "is a Prime Number");
		else System.out.println(number + " is not a Prime Number");
	}
}


import java.util.Scanner;

public class CheckEvenOrOddAndPrimeOrNot {
	public static void main(String[]args) {
		int a;

		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter Your Number :");
		a = scan.nextInt();

		boolean j = false;
		for(int i = 2; i <= a/2; ++i) {     //  
			if(a % i == 0) {
				j = true;
				break;
			}
		}

		if(!j) System.out.println(a + " is a Prime Noumber");
		else System.out.println(a + " is a Not Prime Number");
	}
}*/


public class Condition {
	public static void main(String[]args) {
		int time = 20;

		string result = (time < 10) ? " Iam Krishna " : " Iam Ram ";
	}
}