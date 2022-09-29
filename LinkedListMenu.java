package bl.com.linkedlistds;

public class LinkedListMenu {

	public static void main(String[] args) {
		LinkedListOperations list = new LinkedListOperations();

		list.insertLast(56);
		list.insertLast(70);;
		list.display();
		System.out.println('\n');
		System.out.println("After inserting 30 in the middle "  );
		list.insertNthpos(30,2);
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
