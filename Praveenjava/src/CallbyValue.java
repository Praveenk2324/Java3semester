
public class CallbyValue {

	public static void main(String[] args) {
		int num=20;
		System.out.println("before calling="+num);
		increment(num);
		System.out.println("after calling"+num);

	}
	public static void increment(int value) {
		value++;
		System.out.println("inside method"+value);
	}

}
