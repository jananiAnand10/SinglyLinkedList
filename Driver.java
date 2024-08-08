public class Driver {
public static void main(String[] args) {
	LinkedList myLinkedList=new LinkedList(0);
	myLinkedList.append(1);
	myLinkedList.append(2);
	myLinkedList.append(3);
	myLinkedList.getHead();
	myLinkedList.getTail();
	myLinkedList.getLength();
//	System.out.println(myLinkedList.removeLast().value);
//	myLinkedList.prepend(6);
//	myLinkedList.prepend(7);
//	System.out.println(myLinkedList.removeFirst().value);
//	myLinkedList.getHead();
//	myLinkedList.getTail();
//	myLinkedList.getLength();
//	System.out.println(myLinkedList.get(1).value);
//	System.out.println(myLinkedList.set(5, 0));
//	System.out.println(myLinkedList.insert(2, 7));
//	System.out.println(myLinkedList.remove(2).value);
	myLinkedList.reverse();
	myLinkedList.printList();

}
}
