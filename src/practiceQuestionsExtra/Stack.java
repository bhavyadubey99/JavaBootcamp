package practiceQuestionsExtra;

public class Stack {
	
	protected int[] data; //array
	protected int tos; //top of stack
	
	public Stack() {
		
		data = new int[5];
		tos = -1;
		
	}

	public Stack(int cap) {
		// cap -> capacity.
		data = new int[cap];
		tos = -1;
	}
	
	public void push(int item) throws Exception{
		
		if(isFull()){
			throw new Exception("Stack Overflow.");
		}
		tos++;
		this.data[tos] = item;
	}
	
	public int pop() throws Exception{
		if(isEmpty()) {
			throw new Exception("Stack is Empty.");
		}
		int temp = data[tos];
		data[tos] = 0; 
		tos--; 
		return temp;
	}
	
	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Empty.");
		} 
		return data[tos];
	}
	
	public int size() {
		return tos + 1;
	}
	
	public boolean isEmpty() {
		return this.size() == 0;
	}
	
	public boolean isFull() {
		return this.size() == data.length;
	}
	
	public void display() throws Exception{
		if(isEmpty()) {
			throw new Exception("Stack is Empty.");
		}
		System.out.println("---------------");
		for(int i = tos; i >= 0; i--) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
		System.out.println("---------------");
		
		
	}
}
