package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerTable {

	public static List<Customer> getData(){
		return Stream.of(new Customer(1, "A", "a@gmail.com", Arrays.asList("1111111111","2222222222")),
				  new Customer(2, "B", "b@gmail.com", Arrays.asList("3333333333","4444444444")),
				  new Customer(3, "C", "c@gmail.com", Arrays.asList("5555555555","6666666666"))).collect(Collectors.toList());
	}
}
