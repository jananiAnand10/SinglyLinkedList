public class Driver {
public static void main(String[] args) {
	LinkedList myLinkedList=new LinkedList(0);
	myLinkedList.append(1);
	myLinkedList.append(2);
	myLinkedList.append(3);
	myLinkedList.getHead();
	myLinkedList.getTail();
	myLinkedList.getLength();
	System.out.println(myLinkedList.removeLast().value);
	myLinkedList.prepend(6);
	myLinkedList.prepend(7);
	System.out.println(myLinkedList.removeFirst().value);
	myLinkedList.getHead();
	myLinkedList.getTail();
	myLinkedList.getLength();
	System.out.println(myLinkedList.get(1).value);
	System.out.println(myLinkedList.set(5, 0));
	System.out.println(myLinkedList.insert(2, 7));
	System.out.println(myLinkedList.remove(2).value);
	myLinkedList.reverse();
	myLinkedList.printList();

	//additional methods
	LinkedList myLinkedList1 = new LinkedList(1);

        myLinkedList1.append(1);
        myLinkedList1.append(2);
        myLinkedList1.append(2);
        myLinkedList1.append(3);
        myLinkedList1.append(3);
        myLinkedList1.append(3);
        myLinkedList1.append(4);

        myLinkedList1.removeDuplicates();

        myLinkedList1.printList();

	LinkedList list1 = new LinkedList(1);
        list1.append(0);
        list1.append(1);
        list1.append(1);
        System.out.println("Convert 1011 to 11:");
        System.out.println("Input: 1 -> 0 -> 1 -> 1");
        System.out.println("Output: " + list1.binaryToDecimal());
        System.out.println("---------------");

	// Reverse a sublist within the linked list
        list1.reverseBetween(1, 2);
        System.out.println("\nReversed sublist (1, 2): ");
        list1.printList();

}
}
