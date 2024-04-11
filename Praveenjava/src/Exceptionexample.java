
public class Exceptionexample {
	public static void main(String[] args) {
	try {
		throwExceptionMethod();
	}catch(IllegalAccessException e) {
		System.out.println("caught an IllegalAccessException");
		e.printStackTrace();
	}
}
	public static void throwExceptionMethod() throws IllegalAccessException{
		throw new IllegalAccessException("this is IllegalAccessException");
	}
}