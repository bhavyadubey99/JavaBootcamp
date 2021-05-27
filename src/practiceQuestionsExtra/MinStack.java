package practiceQuestionsExtra;

public class MinStack extends DynamicStack {

	protected int min;

	@Override
	public void push(int item) throws Exception {

		if (isEmpty()) {
			super.push(item);
			min = item;
		} else if (item >= min) {
			super.push(item);
		} else if (item < min) {
			super.push((2 * item) - min);
			min = item;

		}

	}

	@Override
	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Empty.");
		} else if (super.peek() < min) {
			// means data was encrypted.
			return min;
		} else {
			return data[tos];
		}
	}
	
	@Override
	public int pop() throws Exception{
		if(isEmpty()) {
			throw new Exception("Stack is Empty.");
		}
		else if(super.peek() < min) {
			//means here, our min was changed --> encrypted data 
			//finding out the new min. 
			int originalValue = min; 
			int topMostElement = super.pop();
			min = (2 * min) - topMostElement;
			return originalValue;
		}
		else {
			return super.pop();
		}
		
	}
	
	public int getMin() throws Exception{
		if(isEmpty()) {
			throw new Exception("Stack is Empty.");
		}
		else {
			return min;
		}
	}
	
	@Override
	public void display() throws Exception{
		if(isEmpty()) {
			throw new Exception("Stack is Empty.");
		}
		
		int prevMin = min; 
		
		System.out.println("---------------------");
		for(int i = tos; i >=0; i--) {
			if(data[i] < min) {
				//accessed an encrypted element, need to print original value. 
				
				
				System.out.print(min + " ");
				
			}
			else {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println();
		System.out.println("---------------------");
	}

}
