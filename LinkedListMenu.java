package bl.com.linkedlistds;

public class LinkedListMenu {

	public static void main(String[] args) {
		LinkedListOperations list = new LinkedListOperations();

		list.insertFirst(56);
		list.insertLast(30);
		list.insertLast(70);
		list.display();
//		list.findNode(30);
		int pozition=list.findNodeWithIndex(30);
		System.out.println(pozition);
//		to insert value 40 to node with value 30
		list.insertNthpos(40,pozition+1);
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
