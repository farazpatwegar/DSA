public class Main {

	public static void main(String[] args) {
	LinkList l1=new LinkList();
//	l1.insert(10);
//	l1.display();
//	System.out.println();
//	l1.insert(11);
//	l1.insert(18);
//	l1.insert(29);
//	l1.insert(123);
//	l1.insert(77);
//	l1.display();
//	System.out.println();
//	l1.insert(111,5);
//	l1.display();
//	System.out.println();
//	l1.insert(111,10);
//	l1.display();
//	System.out.println();
	l1.insert(10);
	l1.insert(20);
	l1.insert(30);
	l1.insert(40);
	l1.insert(50);
	l1.display();
	System.out.println();
	l1.deletingFirstNode();
	l1.display();
	System.out.println();
	l1.deletingNodeAtPosition(3);
	l1.display();
	System.out.println();
	l1.deletingNodeAtPosition(8);
	l1.display();
	System.out.println();
	l1.Reverse();
	l1.display();
	}
	

}
