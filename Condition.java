/* public class Condition {
 	public static void main(String[]args) {
 		int time  = 20;
 
 		if(time < 18) {
			System.out.println("wtf");
		}
		else {
			System.out.println("nothing");
		}
	}
}
import java.util.Scanner;
 public class Condition {
 	public static void main(String[]args) {
 		int a,b;
 		Scanner scan = new Scanner(System.in);
 		System.out.println("Enter your first number : ");
 		a = scan.nextInt();
 		System.out.println("Enter Your second number : ");
 		b = scan.nextInt();
 		char operator;
 			System.out.println(" Enter your operator : ");
 			operator = scan.next().charAt(0);
 			switch(operator) {
 			case '+' :
 				System.out.println(a+ " + " +b + " = " +  (a+b));
 				break;
 			case '-' :
 				System.out.println(a-b);
 				break;
 				case '*' :
 				System.out.println(a*b);
 				break;
 				default :
 				System.out.println(".....");
 				break;
 			}

 	}
 }*/


 public class Condition {
 	public static void main(String[]args) {
 		int time = 22;

 		if(time < 20) {
 			System.out.println(" Iam Miku ");
 		}

 		else if(time < 23) {
 			System.out.println(" Iam Ram");
 		}

 		else {
 			System.out.println(" Iam Krishna ");
 		}
 	}
 }
