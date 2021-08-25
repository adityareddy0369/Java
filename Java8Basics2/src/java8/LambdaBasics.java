package java8;

@FunctionalInterface
interface Cab {  //  when an interfce have exactly one abstract method then it is called functional interface
	// void bookCab(); // by default public abstract void bookCab();
	double bookCab(String source, String destination); 
}

/*
 * class Uber implements cab {
 * 
 * @Override public void bookCab() { System.out.println("Uber booked !! Arriving soon !!"); } }
 */

public class LambdaBasics {
    int instanceVariable = 1000;
    static int staticVariable = 2000;
	public static void main(String[] args) {
		
		// Polymorphic statement
		/*
		 * Cab cab = new Uber(); cab.bookCab(); 
		 */
		
		// Anonymous class implementation
		/*
		 * Cab cab = new Cab() {
		 * 
		 * @Override public void bookCab() { System.out.println("Uber booked !! Arriving soon !!"); } };
		 * cab.bookCab();
		 */
		
		// Using a Lambda expression //  lambda expressinos only work with functional interfaces
		
		// Cab cab = () -> { System.out.println("Uber booked !! Arriving soon !!"); };
		// cab.bookCab();
		LambdaBasics lambda = new LambdaBasics();
		Cab cab = (x,y) -> {
			int localVariable = 5000;
		System.out.println("Uber booked from " + x + " !! " + "To " + y + " !!");
		System.out.println("Local Variable: " + localVariable);
		System.out.println("Instance Variable: " + lambda.instanceVariable);
		System.out.println("Static  Variable: " + LambdaBasics.staticVariable);
		return 10000.5;
		};
		double fare = cab.bookCab("Hyd", "Coorg");
		System.out.println("Fare: " + fare);
		
	}
}
