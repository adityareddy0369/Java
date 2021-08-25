package java8;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

	public static void main(String[] args) {
		List<Customer> customers = CustomerTable.getData();
		List<String> emails = customers.stream().map(x -> x.getMail()).collect(Collectors.toList());
		System.out.println(emails);
		List<List<String>> phoneNums = customers.stream().map(x->x.getPhoneNums()).collect(Collectors.toList());
		System.out.println(phoneNums);
		List<String> phoneNums1 = customers.stream().flatMap(x->x.getPhoneNums().stream()).collect(Collectors.toList());
		System.out.println(phoneNums1);
		     
	}

}
