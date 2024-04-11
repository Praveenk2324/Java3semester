public class Main{
	public static void main(String[] args) {
		try {
			performOperation();
		}catch(IllegalAccessException e) {
			System.out.println("caught illegalexception "+e.getMessage());
		}
 }
	public static void performOperation() throws IllegalAccessException{
		throw new  IllegalAccessException("\nAccess Denied");
	}
}