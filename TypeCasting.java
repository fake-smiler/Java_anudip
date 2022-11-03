//Widening casting

/*public class TypeCasting {
	public static void main(String[]args) {
		int myNum = 7;
		double miku = myNum;
		System.out.println(myNum); // Automatic casting : int to double
		System.out.println(miku);
	}
}*/


//Narrowing Casting

public class TypeCasting {
	public static void main(String[]args) {
		double myDouble = 7.58d;
		int myInt = (int)myDouble;

		System.out.println(myDouble);
		System.out.println(myInt);
	}
}