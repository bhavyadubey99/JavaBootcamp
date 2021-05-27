package practiceQuestionsExtra;

public class Queue {
	
	protected int[] data;
	protected int front; 
	protected int size; 
	
	public Queue() {
		data = new int[5];
		front = 0;
		size = 0;
	}
	
	public Queue(int cap) {
		data = new int[cap];
		front = 0;
		size = 0;
	}
	
	public int getSize() {
		return size;
	}
	
	public void enqueue(int item) throws Exception{
		
		if(isFull()) {
			throw new Exception("Stack is full");
		}
		int idx = (front + size) % data.length; 
		data[idx] = item;
		size++;
		
		
	}
	
	public int dequeue() throws Exception{
		
		if(isEmpty()) {
			throw new Exception("Stack is empty");
		}
		int temp = data[front];
		data[front] = 0; 
		front = (front + 1) % data.length; 
		size--;
		return temp;
	}
	
	public int getFront() throws Exception {
		
		if(isEmpty()) {
			throw new Exception("Stack is empty");
		}
		
		return data[front];
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean isFull() {
		return getSize() == data.length;
	}
	
	public void display() {
		for(int i = 0; i < size; i++) {
			
			int idx = (i + front) % data.length;
			
			System.out.print(data[idx] + " ");	
			
		}
	}

}
