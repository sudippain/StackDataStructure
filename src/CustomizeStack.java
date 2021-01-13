
public class CustomizeStack {

	int[] stack = new int[5];
	int top = 0;

	public void push(int value) {

		stack[top] = value;
		top++;
	}

	public void pop() {
		top--;
		int data = stack[top];
		stack[top] = 0;
		System.out.print("\nPop Element "+data);
	}
	
	public int peek() {
		return stack[top-1];

	}
	

	public void show() {
		if (top > 0) {
			for (int val : stack)
				System.out.print(val + "\t");

		} else {
			System.out.println("\nEmpty Stack");
		}
	}
}
