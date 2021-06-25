
public class SinglyLinkedList {

	class Node{
		int data ;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public Node head=null;
	public Node tail=null;
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			tail.next=newNode;
			tail=newNode;
		}
		
		
	}
	
	
	public void display() {
		
		Node current = head;
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		
		System.out.println("Nodes are : ");
		while(current!=null) {
			System.out.print(current.data+" ");
			current=current.next;
		}
		
		System.out.println();
		
	}
	
	
	
	public void reverse(Node current) {
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		else {
			if(current.next==null) {
				System.out.print(current.data+" ");
				return;
			}
			reverse(current.next);
			System.out.print(current.data+" ");
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		SinglyLinkedList s= new SinglyLinkedList();
		
		s.addNode(1);
		s.addNode(76);
		s.addNode(45);
		s.addNode(2);
		
		s.display();
		
		System.out.println("Reverse Display is :");
		s.reverse(s.head);

	}

}
