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

		// Node head = bucketArray[bucketNo];

		// adding node to the first.
		newNode.next = bucketArray[bucketNo];
		bucketArray[bucketNo] = newNode;
		size++;

		// calculating load factor
		double loadFactor = (1.0 * size) / bucketArray.length;

		int threshold = 2;

		if (loadFactor > threshold) {
			reHash();
		}

	}

	public Integer get(String key) {

		int bucketNo = hashFunction(key);

		Node temp = bucketArray[bucketNo];

		while (temp != null) {

			if (temp.key.equals(key)) {
				return temp.value;
			}

			temp = temp.next;
		}

		return null;
	}

	public boolean containsKey(String key) {

		int bucketNo = hashFunction(key);

		Node temp = bucketArray[bucketNo];

		while (temp != null) {

			if (temp.key.equals(key)) {
				return true;
			}
			temp = temp.next;
		}

		return false;
	}

	public Integer remove(String key) {

		// getting the bucketNo as usual
		int bucketNo = hashFunction(key);

		// checking whether the key even exists?
		Node temp = bucketArray[bucketNo];
		Node prev = null;

		while (temp != null) {

			if (temp.key.equals(key)) {
				break;
			}

			prev = temp;
			temp = temp.next;
		}

		// key was not present if flow of code comes here.
		if (temp == null) {
			return null;
		}

		// if we come out loop due to break keyword.
		if (temp != bucketArray[bucketNo]) {
			// it is not a head node.
			prev.next = temp.next;

		} else {
			// the node is a head node.
			bucketArray[bucketNo] = temp.next;
		}

		size--;
		return temp.value;

	}

	@Override
	public String toString() {

		String res = "";
		for (Node temp : bucketArray) {

			while (temp != null) {

				res += temp.key + " = " + temp.value + "  ";

				temp = temp.next;
			}

		}

		return res;
	}

	private void reHash() {

		Node[] oldBucketArray = bucketArray;

		// creating new bucketarray twice the size
		Node[] newBucketArray = new Node[oldBucketArray.length * 2];

		// changing the bucket array of the hashmap.
		this.bucketArray = newBucketArray;

		// new size - reset, as new array has no elements.
		size = 0;

		// copying and arranging elements of old bucket array to the new bucket array.

		for (Node temp : oldBucketArray) {
			// going through elements on old one.

			while (temp != null) {

				// placing it in new bucket array
				put(temp.key, temp.value);

				// onto next element.
				temp = temp.next;

			}

		}
	}
}
