import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javaDemo.data.Customer;

public class StreamTerminalOperations {
	
	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<>();
		Customer c1 = new Customer("Ram", 30, 12345d, Arrays.asList(126543924, 346531465));
		Customer c2 = new Customer("Ravi", 32, 12243d, Arrays.asList(12654324, 34653465));
		Customer c3 = new Customer("Rahu", 34, 12345d, Arrays.asList(126543724, 346534665));
		Customer c4 = new Customer("Rakul", 28, 12334d, Arrays.asList(128654324, 3465545));
		Customer c5 = new Customer("Sam", 29, 12356d, Arrays.asList(126543264, 346531465));
		Customer c6 = new Customer("Kelab", 30, 12367d, Arrays.asList(12654324, 34381465));
		customers.addAll(Arrays.asList(c1, c2, c3, c4, c5, c6));
		
		// joining()
		System.out.println("Names of customer using joining() -> "+customers.stream().map(Customer::getName).collect(Collectors.joining("-","[","]")));
		
		// counting()
		System.out.println("Total number of customers using counting() -> "+customers.stream().collect(Collectors.counting()));
//		System.out.println("Total number of customers -> "+customers.stream().count());
		
		//mapping()
		System.out.println("Age doubled using mapping() -> "+customers.stream().collect(Collectors.mapping(c->c.getAge()*2, Collectors.toList())));
		
//		System.out.println("Age doubled -> "+customers.stream().map(c->c.getAge()*2).collect(Collectors.toList()));
		
		
		
	}
	
	

}
