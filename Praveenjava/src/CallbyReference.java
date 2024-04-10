
public class CallbyReference {

	public static void main(String[] args) {
		StringBuilder str=new StringBuilder("hello");
		System.out.println("before calling="+str);
		changeValue(str);
		System.out.println("after calling="+str);

	}
	public static void changeValue(StringBuilder value) {
		value.append("world");
		System.out.println("inside method="+value);
	}

}
