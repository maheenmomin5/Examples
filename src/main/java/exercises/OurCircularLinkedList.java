package exercises;

// does not have an end, the last item points to the first//
public class OurCircularLinkedList<T> {

	Node<T> head;
	Node<T> tail;
	
	static class Node<T> {
		T element;
		Node<T> next;
	}
	
	public void add(T element) {
		
		Node<T> newNode = new Node<>();
		newNode.element = element;
		if(this.head == null) {
			this.head = newNode;
			this.tail = newNode;
			return;
		}
		this.tail.next = newNode;
		newNode.next = this.head;
		this.tail = newNode;
		
	}
	public void printSomeEntries() {
		int counter = 0;
		Node<T> current = this.head;
		while(counter <= 100);
			System.out.println("Value: " + current.element);
			current = current.next;
			counter++;
	}
}
