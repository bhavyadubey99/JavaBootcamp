package practiceQuestionsExtra;

public class DynamicQueue extends Queue{
	
	 @Override
	 public void enqueue(int item) throws Exception{
		 
		 if (isFull()) {
			 
			 //creating a queue of double size
			 int[] newqueue = new int[data.length * 2]; 
			 
			 //copying all elements acc to their sequence. 
			 for(int i = 0; i < data.length; i++) {
				 newqueue[i] = data[(front + i) % data.length];
			 }
			 
			 //changing reference
			 data = newqueue; 
			 
			 //and also changing front because front is now at 0. 
			 front = 0;
		 }
		 
		 //enqueueing item
		 super.enqueue(item);
		 
	 }
	
	

}
