package listImplementation;

public class LinkedList {
	Node head;
	
	public void insert(int a) {
		
		Node node=new Node();
		node.data=a;
		node.next=null;
		if(head==null) {
			head=node;
		}else {
			Node n=head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
		}
	}
public void insertAt(int pos,int val) {
		
		if(pos==0) {
			insertAtStart(val);
		}else {
		int cP=0;
		Node n=head;
		while(cP==pos) {
			n=n.next;
			cP++;
		}
		Node a=new Node();
		a.data=val;
		a.next=n.next;
		n.next=a;
		}
	}
public void deleteAt(int pos) {
	if(pos==0) {
		head=head.next;
	}else {
		Node n=head;
		Node n1=null;
		for(int i=0;i<pos-1;i++) {
			n=n.next;
		}
		n.next=n1.next;
		System.out.println("Node Deleted:"+n1.data);
	}
}
	public void insertAtStart(int data) {
		Node node=new Node();
		node.data=data;
		node.next=head;
		head=node;
	}
	public void insertAtLast(int data) {
		Node node=new Node();
		node.data=data;
		node.next=null;
		
		Node a=head;
		while(a.next!=null) {
			a=a.next;
		}
		
		a.next=node;
	
		
	}
	public void show() {
		Node node=head;
		while(node.next!=null) {
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}
	
	
}
