package listImplementation;
/*
 * @Author Rushabh Shah
 */
public class main {
	public static void main(String args[]) {
		//Implementing the functions of other methods
		LinkedList ls=new LinkedList();
		ls.insert(18);
		ls.insert(15);
		//ls.insertAtStart(25);
		ls.insertAtLast(30);
		ls.insertAt(2, 21);
		ls.insertAt(3, 39);
		ls.insertAt(0, 22);
		
		ls.show();
		ls.deleteAt(0);
		System.out.println();
		ls.show();
	}
}
