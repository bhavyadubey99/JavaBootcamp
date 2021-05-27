package practiceQuestionsExtra;

public class QClient {

	public static void main(String[] args) throws Exception {

//		Queue q = new Queue(); 
//		
//		q.enqueue(10);
//		q.enqueue(20);
//		
//		q.display();
//		
//		q.enqueue(30);
//		q.enqueue(40);
//		
//		q.dequeue();
//		q.dequeue();
//		
//		q.enqueue(50);
//		q.enqueue(60);
//		System.out.println();
//		System.out.println("----");
//		
//		q.display();

		DynamicQueue dq = new DynamicQueue();

		dq.enqueue(10);
		dq.enqueue(20);
		dq.enqueue(30);

		dq.dequeue();// 10 removed
		dq.dequeue();// 20 removed.

		dq.enqueue(40);
		dq.enqueue(50);
		
		dq.display(); 
		System.out.println();
		
		dq.enqueue(60);
		dq.enqueue(70);
		dq.enqueue(80);
		dq.enqueue(90);

		dq.display();
	}

}
