@FunctionalInterface
public interface FunctionalInterfaceDemo {

	void calcSum(Integer x, Integer y);
	
	static boolean checkNonNull(Integer x) {
		if(x!=null)
			return true;
		return false;
	}
}
