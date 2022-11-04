// Multiple methods in same name but different parameters

/*int myMethods(int a, int a)
double myMethods(doubble c,double d)
float myMethods(float e,flaot f)*/

public class methodOverloading {

	static int myMethods(int a, int b) {
		return a+b;
	}

	static double myMethods(double c, double d) {      // three methods in same name but diffrent arguments
		return c+d;
	}

	/*static float myMethods(float e, float f) {
		return e+f;
	}*/

	public static void main(String[]args) {

		int myNum1 = myMethods(5,5);
		double myNum2 = myMethods(4.3,6.26);                  // passed value to diffrent arguments
		//float myNum3 = myMethods(43.2,6.165);

		System.out.println("int : " + myNum1);
		System.out.println("double : " + myNum2);
		//System.out.println("float : " + myNum3);
	}
}