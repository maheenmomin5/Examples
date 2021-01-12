package exercises;

public class OurDoublyLinkedList<T> {
	
	Node<T> head;
	Node<T> tail;
	
	static class Node<T> {
		T element;
		Node<T> previous;
		Node<T> next;
	}
	
public void add(T element) {
	//create brand new node//	
		Node<T> newNode = new Node<>();
		newNode.element = element;
		
	//only for the first node- special case(only happens once)//
		if(this.head == null) {
			this.head = newNode;
			this.tail = newNode;
			return;
		}
	//connecting/attaching the node to the others//	
		this.tail.next = newNode;
		newNode.previous = this.tail;
	//now thats done- the brand new one is the last//
		this.tail = newNode;

	}
		public void printAllValues() {
			Node<T> current = this.head;
			System.out.println(current.element);
			while(current.next != null) {
				current = current.next;
				System.out.println(current.element);

			}
	}
}
