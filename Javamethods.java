 /*public class Javamethods {
 	static void myMethod() {    // Create own method
 		System.out.println("I just got executed");
 	}

 	public static void main(String[]args) {
 		myMethod();    // call method
 		myMethod();
 		myMethod();
 		myMethod();
 	}
 }*/

 /*public class Javamethods {
 	static void myMethods( String fname) {         // single parameter
 			System.out.println(fname + "miku "); 
 	} 

 	static void myMethod( int age) {
 		System.out.println(age + " This is my age ");
 	}

 	static void Mymethods( String fname , int age) {                                  // multiple parameter
 		System.out.println("My Name is " + fname + age + " year old boy..");
 	}

 	public static void main(String[]args) {
 		myMethods("Ram ");                       // value of Single parameter arguments
 		myMethods(" Krish ");
 		myMethod(22);
 		Mymethods("Ramachandran " , 22);          // value of multiple parameter arguments
 	}
 }*/



 // if you want return value in methods so you use int... dont use void because if you use void that not return value

 /*public class Javamethods {
    static int myMethods(int x) {
        return x + 5;
    }
    public static void main(String[]args) {
        System.out.println(myMethods(5));
    }
 }*/


 // multiple parameter with return value


 /*public class Javamethods {

    static int myMethods(int x, int y) {
        return x+y;
    }
    public static void main(String[]args) {
        System.out.println(myMethods(5,5));
    }
 }*/



 /*public class Javamethods {

    static int myMethods(int x, int y) {
        return x+y;
    }
    public static void main(String[]args) {
        int z = myMethods(5,5);
        System.out.println(z);
    }
 }*/

 // A methods with if else

 public class Javamethods {

    static void myMethods(int age) {
        if(age < 18) {
            System.out.println("Your not Eligible age");
        }

        else {
            System.out.println("Youre Eligible age");
        }
    }

    public static void main(String args[]) {
        myMethods(16);
    }
 }