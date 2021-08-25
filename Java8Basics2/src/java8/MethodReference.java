package java8;

interface Calculator {
	void add(int num1, int num2);
}

class Calc {
	public static void addSomething(int num1, int num2) {
		System.out.println("Sum of num1 and num2 is : " + (num1+num2));
	}
	
	public void letsAdd(int num1, int num2) {
		System.out.println("Sum of num1 and num2 is : " + (num1+num2));
	}
}

@FunctionalInterface
interface Messenger {
	Message getMessage();
}

class Message {
	Message() {
		System.out.println("Inside Constructor");
	}
}
public class MethodReference {

	public static void main(String[] args) {
		
		// Calc.addSomething(2, 5);
		
		// Referring to static method
		Calculator calculator = Calc::addSomething;
		calculator.add(2, 5);
		
		// Referring to a non static method or instance method
		Calc calc = new Calc();
		Calculator calculator2 = calc::letsAdd;
		calculator2.add(5, 7);
		
		// Referring to a constructor
		Messenger messanger = Message::new;
		messanger.getMessage();
		
	}

}
