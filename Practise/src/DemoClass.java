interface DemoInterface {
	// default method
	default void display() {
		System.out.println("The dispaly() method invoked");
	}

	static void staticDisplay() {
		System.out.println("Static display method");
	}
}

// interface without default method
interface DemoInterface1 extends DemoInterface {

	
}

// interface without default method
interface DemoInterface2 extends DemoInterface {

}

// implementation class code
public class DemoClass implements DemoInterface2, DemoInterface1 {
	@Override
	public void display() {
		DemoInterface1.super.display();
	}

	public static void main(String args[]) {
		DemoClass obj = new DemoClass();
		// calling method
		obj.display();
		DemoInterface.staticDisplay();
	}

}
