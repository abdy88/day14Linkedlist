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
	
	public void insertNthpos(int data,int pos)
	{
		
		Node newNode = new Node(data);
		
		if (head==null)
		{System.out.println("List empty!!");}
		else if( pos<=0 ||pos>count  )
		{
			System.out.println("Invalid posn");
			
		}
			else if(pos==1)
			{	insertFirst(data);
			
			}
		
			else
			{
				Node temp = head;
				for(int i=1;i<pos-1;i++)
				{
					temp=temp.next;
					
					
				}
				
				
				newNode.next=temp.next;
				temp.next=newNode;
				
				
				
			}

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
