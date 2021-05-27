package LinkedList;

public class LinkedList {

	public class Node {
		int data;
		Node next;
	}

	private Node head;

	public void display() {
		if (isEmpty()) {
			System.out.println("Empty");
		}
		System.out.println("---------------------------");
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
		System.out.println("NULL");

		System.out.println("---------------------------");
	}

	public int size() {

		Node temp = head;

		int count = 0;

		while (temp != null) {
			count++;
			temp = temp.next;
		}

		return count;
	}

	public boolean isEmpty() {
		// return size() == 0; --> increases time complexity. O(n)
		return head == null;
	}

	public int getFirst() throws Exception {
		if (isEmpty()) {
			throw new Exception("Linked List is empty.");
		}
		return head.data;
	}

	public int getLast() throws Exception {

		if (isEmpty()) {
			throw new Exception("Linked List is empty.");
		}

		Node temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}

		return temp.data;
	}

	public int getAt(int index) throws Exception {

		if (isEmpty()) {
			throw new Exception("Linked List is empty.");
		}

		if (index < 0 || index >= size()) {
			throw new Exception("Invalid index");
		}

//		int i = 0; 
//		
//		Node temp = head;
//		
//		while(temp!= null) {
//			if(index == i) {
//				break;
//			} 
//			temp = temp.next;
//			i++;
//			
//		}

		Node temp = head;

		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp.data;

	}

	private Node getNodeAt(int idx) throws Exception {
		if (isEmpty()) {
			throw new Exception("Linked List is empty.");
		}

		if (idx < 0 || idx >= size()) {
			throw new Exception("Invalid index");
		}

		Node temp = head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}

		return temp;
	}

	public void addLast(int item) throws Exception {

		// creating new node.
		Node newNode = new Node();
		newNode.data = item;
		newNode.next = null;

		// linking
		if (isEmpty()) {
			// spl case
			this.head = newNode;

		} else {
			Node lastNode = getNodeAt(size() - 1);
			lastNode.next = newNode;
		}

	}

	public void addFirst(int item) throws Exception {

		Node newNode = new Node();
		newNode.data = item;
		newNode.next = null;

		// linking
		newNode.next = head;
		head = newNode;
	}

	public void addAt(int idx, int item) throws Exception {

		if (idx < 0 || idx > size()) {
			throw new Exception("Invalid Index.");
		}

		if (idx == 0) {
			addFirst(item);
			return;
		}

		if (idx == size()) {
			addLast(item);
			return;
		}

		// getting existing nodes.
		Node n1 = getNodeAt(idx - 1);
		Node n2 = getNodeAt(idx);

		// creating new node
		Node nn = new Node();
		nn.next = null;
		nn.data = item;

		// linking
		n1.next = nn;
		nn.next = n2;

	}

	public int removeLast() throws Exception {

		if (isEmpty()) {
			throw new Exception("Linked List is Empty.");
		}

		if (size() == 1) {
			int temp = head.data;
			head = null;
			return temp;
		}

		// getting the last node
		Node ln = getNodeAt(size() - 1);

		// getting second last node.
		Node sln = getNodeAt(size() - 2);

		// last node is to be removed, so removing its link from the second last node,
		// and returning the data in it.
		sln.next = null;
		return ln.data;
	}

	public int removeFirst() throws Exception {

		if (isEmpty()) {
			throw new Exception("Linked List is Empty.");
		}

		int rv = getFirst();

		head = head.next;

		return rv;

	}

	public int removeAt(int idx) throws Exception {
		if (isEmpty()) {
			throw new Exception("Linked List is Empty");
		}

		if (idx >= size()) {
			throw new Exception("Invalid Index");
		}

		if (idx == 0) {
			return removeFirst();
		} else if (idx == size() - 1) {
			return removeLast();
		} else {
			Node n1 = getNodeAt(idx - 1);
			Node n2 = getNodeAt(idx);
			n1.next = n2.next;
			return n2.data;
		}
	}

	public void reverse() {
		Node prev = head;
		Node curr = prev.next;

		while (curr != null) {
			Node ahead = curr.next;
			curr.next = prev;

			prev = curr;
			curr = ahead;

		}

		head.next = null;
		head = prev;

	}

	public void reverseR() {

		reverseR(null, head);
		// abstraction.

	}

	private void reverseR(Node prev, Node curr) {

		// recursive approach

		if (curr == null) {
			head = prev;
			return;
		}

		// Way 1
		Node ahead = curr.next;
		curr.next = prev;
		reverseR(curr, ahead);

		// Way2
		// reverseR(curr,curr.next);
		// curr.next = prev;

	}

	public void reverseR2() {

		Node temp = head;
		reverseR2(head);
		temp.next = null;

	}

	private void reverseR2(Node curr) {
		if (curr.next == null) {
			head = curr;
			return;
		}

		reverseR2(curr.next);
		curr.next.next = curr;
	}

	public int MidPoint() {

		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {

			slow = slow.next;
			fast = fast.next.next;
		}

		return slow.data;
	}

	public int kthfromLast(int k) {

		Node one = head;
		Node two = head;

		for (int i = 1; i <= k; i++) {
			two = two.next;
		}

		while (two != null) {
			one = one.next;
			two = two.next;
		}

		return one.data;
	}

	public void kReverse(int k) {
		head = kReverse(k, head);
	}

	private Node kReverse(int k, Node node) {

		if (node == null) {
			return null;
		}

		// BP : S1, S2, S3

		// SP : S2, S3

		// to identify arguement of smaller problem
		Node temp = node;

		for (int i = 0; i < k; i++) {
			if (temp == null)
				break;
			temp = temp.next;
		}

		// call -- s2 and s3 are reversed.
		Node prev = kReverse(k, temp);

		// self work.
		Node curr = node;

		while (curr != temp) {
			Node ahead = curr.next;
			curr.next = prev;
			prev = curr;
			curr = ahead;
		}

		return prev;

	}

	public void sortEvenOddWrong() {

		Node fp = head;
		Node fpp = head;
		Node sp = head;
		Node spp = head;

		while (fp != null || sp != null) {
			if (fp.data % 2 != 0) {
				// val is odd.
//				System.out.println("fp -> " + fp.data);
//				System.out.println("sp -> " + sp.data);
				fpp = fp;
				spp = sp;
				fp = fp.next;
				sp = sp.next;

			} else {
				// val is even. so we keep first pointer at this even value only.
				if (sp.data % 2 == 0) {
//					System.out.println("sp -> " + sp.data);
					spp = sp;
					if (sp.next == null)
						break;
					sp = sp.next;
				} else {
					spp.next = sp.next;
					sp.next = fp;
					if (fp != head)
						fpp.next = sp;
					else
						head = sp;

					spp = sp;
					if (sp.next != null) {
						sp = sp.next;
						fpp = spp;
						fp = sp;
					}
				}

			}
		}
	}

	public LinkedList mergeSortedLinkedLists(LinkedList other) {
		
		LinkedList sorted = new LinkedList();
		
		return sorted;
		
	}

}
