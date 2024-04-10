
public class Stack {
	private int maxSize;
	private int[] stackArray;
	private int top;
	public Stack(int size) {
		maxSize=size;
		stackArray=new int[maxSize];
		top=-1;
	}
	public void push(int value) {
		if(top==maxSize-1) {
			System.out.println("Stack overflow"+value);
		}else {
			stackArray[++top]=value;
			System.out.println("Pushed element="+value);
		}
	}
	public int pop() {
		if(top==-1) {
			System.out.println("Stack underflow");
			return -1;
		}else {
			int value=stackArray[top--];
			System.out.println("popped element="+value);
			return value;
		}
	}
	public void display() {
		if (top==-1) {
			System.out.println("stack is empty");
		}else {
			System.out.println("stack elements");
		}	for(int i=0;i<=top;i++) {
			System.out.println(stackArray[i]+" ");
		}
		System.out.println();
	}

public static void main(String[] args) {
	Stack stack=new Stack(5);
	stack.push(10);
	stack.push(20);
	stack.push(12);
	stack.push(33);
	stack.push(45);
	stack.display();
	stack.pop();
	stack.display();
}

}





