package bl.com.linkedlistds;

public class LinkedListMenu {

	public static void main(String[] args) {
		LinkedListOperations list = new LinkedListOperations();

		list.insertFirst(56);
		list.insertLast(30);
		list.insertLast(70);
		list.display();
//		list.findNode(30);
		int pozition = list.findNodeWithIndex(30);
		System.out.println(pozition);
//		to insert value 40 to node with value 30
		list.insertNthpos(40, pozition + 1);
		list.display();
		
//UC9
		pozition = list.findNodeWithIndex(40);
		System.out.println(pozition);
		
		list.removeNthPosn(pozition-1);
		list.display();
		System.out.println("size of linked list is " + list.count);
		
		
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
