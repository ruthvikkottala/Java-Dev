import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javaDemo.data.Customer;

public class StreamTerminalOperations {

	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<>();
		Customer c1 = new Customer("Ram", 30, 12345d, Arrays.asList(126543924, 346531465));
		Customer c2 = new Customer("Ravi", 32, 12243d, Arrays.asList(12654324, 34653465));
		Customer c3 = new Customer("Rahu", 34, 12345d, Arrays.asList(126543724, 346534665));
		Customer c4 = new Customer("Rakul", 28, 12334d, Arrays.asList(128654324, 3465545));
		Customer c5 = new Customer("Sam", 32, 12356d, Arrays.asList(126543264, 346531465));
		Customer c6 = new Customer("Kelab", 30, 12367d, Arrays.asList(12654324, 34381465));
		customers.addAll(Arrays.asList(c1, c2, c3, c4, c5, c6));

		// joining()
		System.out.println("Names of customer using joining() -> "
				+ customers.stream().map(Customer::getName).collect(Collectors.joining("-", "[", "]")));

		// counting()
		System.out.println(
				"Total number of customers using counting() -> " + customers.stream().collect(Collectors.counting()));
//		System.out.println("Total number of customers -> "+customers.stream().count());

		// mapping()
		System.out.println("Age doubled using mapping() -> "
				+ customers.stream().collect(Collectors.mapping(c -> c.getAge() * 2, Collectors.toList())));

//		System.out.println("Age doubled -> "+customers.stream().map(c->c.getAge()*2).collect(Collectors.toList()));

		// maxBy() and minBy()
		Optional<Customer> maxAge = customers.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Customer::getAge)));
		System.out.println("Max Age Customer -> " + maxAge.get());

//		System.out.println("Max age customer using max() -> "+ customers.stream().max(Comparator.comparing(Customer::getAge)).get());
//		System.out.println("Max age customer using reduce -> "+ customers.stream().reduce((a,b)->a.getAge()>b.getAge()?a:b).get());

		Optional<Customer> minAge = customers.stream()
				.collect(Collectors.minBy(Comparator.comparing(Customer::getAge)));
		System.out.println("Min Age Customer -> " + minAge.get());

//		System.out.println("Min age customer using max() -> "+ customers.stream().min(Comparator.comparing(Customer::getAge)).get());
//		System.out.println("Min age customer using reduce -> "+ customers.stream().reduce((a,b)->a.getAge()<b.getAge()?a:b).get());

		// summingInt() and averagingInt()

		Integer ageSum = customers.stream().collect(Collectors.summingInt(Customer::getAge));
		System.out.println("Sum of all ages -> " + ageSum);
		
//		Integer ageSum2 = customers.stream().map(Customer::getAge).reduce(0, (a,b)->a+b);
//		System.out.println("Sum of all ages using reduce -> " + ageSum2);

		Double avgAge = customers.stream().collect(Collectors.averagingInt(Customer::getAge));
		System.out.println("Average of all ages -> " + avgAge);
		
//		Double avgAge2 = customers.stream().map(Customer::getAge).mapToDouble(i->i).average().getAsDouble();
//		System.out.println("Average of all ages -> " + avgAge2);
		
		// groupingBy()
		Map<Integer, List<Customer>> ageMap =customers.stream().collect(Collectors.groupingBy(Customer::getAge));
		System.out.println("Age Map -> "+ ageMap);
		
		Map<Integer, List<String>> ageNameMap = customers.stream().collect(Collectors.groupingBy(Customer::getAge,Collectors.mapping(Customer::getName, Collectors.toList())));
		System.out.println("Age Name Map -> "+ ageNameMap);
		
		Map<Integer, Long> ageCountMap= customers.stream().collect(Collectors.groupingBy(Customer::getAge, Hashtable::new, Collectors.counting()));
		System.out.println("Age count Map -> "+ageCountMap);
	}

}
