package listImplementation;

public class LinkedList {
	Node head;
	
	public void insert(int a) {
		//Inserting a node in the list
		Node node=new Node();
		node.data=a;
		node.next=null;
		if(head==null) {//Checking if its the first node
			head=node;
		}else {
			Node n=head;
			//Traversing through the last node and then adding the values
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;// Adding the value
		}
	}
public void insertAt(int pos,int val) {
		//Inserting value at specific position
		if(pos==0) {
			//If the position is 0 than the node should be added in the start
			insertAtStart(val);
		}else {
		int cP=0;//cP = Current Position
		Node n=head;
		while(cP==pos) {
			//Travsering till that position
			n=n.next;
			cP++;
		}
		Node a=new Node();
		//Exchanging values
		a.data=val;
		a.next=n.next;
		n.next=a;
		}
	}
public void deleteAt(int pos) {	//Deleting node in a specific position
	if(pos==0) {
		head=head.next;//If its at starting position then just change the head
	}else {
		Node n=head;
		Node n1=null;
		for(int i=0;i<pos-1;i++) {
			n=n.next; // traversing till the node before i have to delete
		}
		n.next=n1.next;// assigning values
		System.out.println("Node Deleted:"+n1.data); // Printing the deleted node
	}
}
	public void insertAtStart(int data) {//Inserting the node in the beginniing
		Node node=new Node();
		node.data=data;
		node.next=head;
		head=node;
	}
	public void insertAtLast(int data) {//Inserting the node in the last position
		Node node=new Node();
		node.data=data;
		node.next=null;
		
		Node a=head;
		while(a.next!=null) {
			a=a.next;
		}
		
		a.next=node;
	
		
	}
	public void show() {//Displaying the values in the list
		Node node=head;
		while(node.next!=null) {
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}
	
	
}
