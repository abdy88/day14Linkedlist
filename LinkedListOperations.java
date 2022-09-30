package bl.com.linkedlistds;

public class LinkedListOperations

{
	Node head = null;
	int count = 0;

	public void insertFirst(int data)

	{
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		}

		else {
			newNode.next = head;
			head = newNode;

		}

		count++;

	}

	public void insertLast(int data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}

			temp.next = newNode;
		}
		count++;

	}

	public void insertNthpos(int data, int pos) {

		Node newNode = new Node(data);

		if (head == null) {
			System.out.println("List empty!!");
		} else if (pos <= 0 || pos > count) {
			System.out.println("Invalid posn");

		} else if (pos == 1) {
			insertFirst(data);

		}

		else {
			Node temp = head;
			for (int i = 1; i < pos - 1; i++) {
				temp = temp.next;

			}

			newNode.next = temp.next;
			temp.next = newNode;

		}
		count++;

	}

	public void removeFirst() {
		if (head == null)
			System.out.println("list empty");
		else {
			Node temp = head;
			head = head.next;
			temp.next = null;
			temp = null;

		}
		count--;
	}

	public void removeLast() {
		if (head == null)
			System.out.println("list empty");
		else {

			Node temp = head;
			Node prev = null;
			while (temp.next != null) {
				prev = temp;
				temp = temp.next;

			}
			prev.next = null;
			temp = null;

		}
		count--;
	}

	public void removeNthPosn(int pos) {

		if (head == null) {
			System.out.println("List empty!!");
		} else if (pos <= 0 || pos > count) {
			System.out.println("Invalid posn");

		} else if (pos == 1) {
			removeFirst();

		}

		else {
			Node temp = head;
			Node prev = null;
			for (int i = 0; i < pos; i++) {

				prev = temp;
				temp = temp.next;

			}

			prev.next = temp.next;
			temp.next = null;
			temp = null;

		}
		count--;

	}

	public void findNode(int data1) {

		if (head == null)
			System.out.println("List empty!!");

		else {
			Node temp = head;
			while (temp.next != null) {
				if (temp.data == data1) {
					System.out.println(temp.data + "present at position");

				}
				temp = temp.next;
				if (temp.data == data1) {
					System.out.println(temp.data + "present");
				}
			}

		}

	}

	int findNodeWithIndex(int data1) {
		int flag = 0;
		int position = 0;
		if (head == null)
			System.out.println("List empty!!");

		else {
			Node temp = head;

			for (int i = 1; i <= count; i++) {
				if (temp.data == data1) {
					System.out.println(temp.data + "present at position" + i);
					flag = 1;
					position = i;
				}
				temp = temp.next;

			}

			if (flag == 0) {
				System.out.println("not present");

			}

		}
		return position;

	}

	public void display() {

//		Node newNode = new Node();
		if (head == null)
			System.out.println("List empty!!");
		else {
			Node temp = head;
			while (temp.next != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}

			System.out.println(temp.data);
//			System.out.println(temp.next);

		}

	}

}
