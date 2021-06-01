package HashMapImplementation;

public class HashMap {

	private class Node {
		String key;
		int value;
		Node next;

		public Node(String key, int value) {
			this.key = key;
			this.value = value;
		}
	}

	Node[] bucketArray;
	int size;

	public HashMap() {

		this(4); // calling constructor having arguments.

	}

	public HashMap(int capacity) {
		bucketArray = new Node[capacity];
		size = 0;
	}

	private int hashFunction(String key) {
		// returns the bucket no.

		int hashcode = key.hashCode();

		int bucketNo = hashcode % bucketArray.length;

		return bucketNo;

	}

	public void put(String key, int value) {

		int bucketNo = hashFunction(key);
		// this gives which bucket no key will it go to, or already exists in.

		// if key is already present.
		Node temp = bucketArray[bucketNo];

		while (temp != null) {
			if (temp.key == key) {
				temp.value = value;
				return;
			}
			temp = temp.next;
		}

		// if code reaches here, means key wasn't present in bucketArray.
		// key was not already present.
		Node newNode = new Node(key, value);

		Node head = bucketArray[bucketNo];

		// adding node to the first.
		newNode.next = head;
		head = newNode;
		size++;

	}

}
