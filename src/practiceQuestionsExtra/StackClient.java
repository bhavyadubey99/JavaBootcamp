package practiceQuestionsExtra;

public class StackClient {

	public static void main(String[] args) {
		
		try {
		
		MinStack s = new MinStack(); 
		
		s.push(10);
		s.push(50);
		s.push(40);
		s.push(6);
		s.push(45);
		s.push(2);
		
		s.display();
		
		System.out.println("Min : " + s.getMin());
		System.out.println("Popped: " + s.pop());
		System.out.println("Min : " + s.getMin());
		System.out.println("Popped: " + s.pop());
		System.out.println("Min : " + s.getMin());
		System.out.println("Popped: " + s.pop());
		System.out.println("Min : " + s.getMin());
		System.out.println("Popped: " + s.pop());
		
		s.display();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
