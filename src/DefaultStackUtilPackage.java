import java.util.Stack;

public class DefaultStackUtilPackage {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println("Print The Stack Elements");
		s.forEach(a -> System.out.print(a +"\t"));
		System.out.println("\nSize of Stack After Push Element\n"+s.size());
		System.out.println("Top Element Before pop\n"+s.peek());
		s.pop();
		System.out.println("Top Element After pop\n"+s.peek());
		System.out.println("Size of Stack After Pop Element\n" +s.size());
		System.out.println("Print Elements After POP");
		
		if(!s.isEmpty())
		s.forEach(a -> System.out.print(a +"\t"));
		else
			System.out.println("Empty Stack");
		
		while(!s.isEmpty()) {
		s.pop();
	}
		if(!s.isEmpty())
			s.forEach(a -> System.out.print(a +"\t"));
			else
				System.out.println("\nEmpty Stack");
		
		
	}
}
