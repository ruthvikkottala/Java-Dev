import java.util.Arrays;
import java.util.Optional;

import javaDemo.data.Customer;

public class OptionalDemo {

	public static void main(String[] args) {

		Customer c = new Customer("Ram", 28, null, Arrays.asList(123456, 234567));
		Customer c1 = new Customer(null, 30, 1234d, Arrays.asList(123456, 234567));

		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional.isPresent());

		Optional<Object> ofOptional = Optional.of(c1.getAccNumber());
		System.out.println(ofOptional.get());

		Optional<Object> ofNullableOptional = Optional.ofNullable(c.getAccNumber());
		System.out.println(ofNullableOptional.isEmpty());

		Optional<Object> ofElseOptional = Optional.ofNullable(c.getAccNumber());
		System.out.println(ofElseOptional.orElse(0000d));

		try {
			Optional<Object> ofElseThrowOptional = Optional.ofNullable(c.getAccNumber());
			System.out.println(ofElseThrowOptional.orElseThrow(() -> new Exception("No value found")));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		String name = Optional.ofNullable(c1.getName()).map(String::toUpperCase).orElseGet(() -> "No Name Found");
		System.out.println("Customer Name -> " + name);

	}
}
