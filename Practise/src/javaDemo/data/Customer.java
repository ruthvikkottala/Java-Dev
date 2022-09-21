package javaDemo.data;

import java.util.List;

public class Customer {

	private String name;

	private Integer age;

	private Double accNumber;

	private List<Integer> areaNumbers;

	public Customer(String name, Integer age, Double accNumber, List<Integer> phoneNumbers) {
		super();
		this.name = name;
		this.age = age;
		this.accNumber = accNumber;
		this.areaNumbers = phoneNumbers;
	}

	public List<Integer> getAreaNumbers() {
		return areaNumbers;
	}

	public void setAreaNumbers(List<Integer> phoneNumbers) {
		this.areaNumbers = phoneNumbers;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", accNumber=" + accNumber + ", areaNumbers=" + areaNumbers
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(Double accNumber) {
		this.accNumber = accNumber;
	}
}
