
public class Main {

	public static void main(String[] args) {
		CustomizeStack cs = new CustomizeStack();
		cs.push(23);
		cs.push(25);
		cs.push(27);
		cs.push(29);
		cs.push(31);
		System.out.println("Print The All Elements");
		cs.show();
		System.out.println("\nPeek Element Before POP " + cs.peek());
		cs.pop();
		System.out.println("\nPeek Element After POP " + cs.peek());
		while(cs.top!=0) {
		cs.pop();
		}
		
		cs.show();
	}
}
