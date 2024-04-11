
public class Nestedtry {
	public static void main(String[] args) {
		try {
			int[] numbers= {1,2,3,4};
			try {
				int result=numbers[6];
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("inner catch block");
			
			}
			System.out.println("outside inner catch block");
		}catch(Exception e) {
			System.out.println("outer catch block");
		}
		System.out.println("outside outer try catch");
		
		
		
	}
	
		
}
