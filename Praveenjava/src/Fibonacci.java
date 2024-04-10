//import java.util.Scanner;
public class Fibonacci {
	public static int fibonacci(int n) {
		if(n<=1) {
			return n;
		}else {
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
	public static void main(String[] args) {
	//	Scanner scanner=new Scanner(System.in);
		int n=10;
		//System.out.println("n=");
		//int n=scanner.nextInt();
		System.out.println("fibonacci="+fibonacci(n));
	}
}
