package bl.com.linkedlistds;

public class LinkedListMenu {

	public static void main(String[] args) {
		LinkedListOperations list = new LinkedListOperations();

		list.insertFirst(56);
		list.insertFirst(30);
		list.insertFirst(70);
		list.display();
	}

}

class Node {

	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;

	}

}
