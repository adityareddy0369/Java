package java8;

import java.util.Arrays;
import java.util.List;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		int result = 0;
		for(Integer value: list) {
			result = result +(value*2);
		}
		System.out.println(result);
		
		// Map takes fuction as a parameter
		// reduce takes a initial value and binaryoperator as a parameters // binaryoperator takes 2 operands and operates on it
		System.out.println(list.stream().map(x -> x*2).reduce(0,(a,b) -> a+b));
		
	}

}
