package datastructures;

class Node {
	int key;
	Node prev;
	Node next;
	Node(){
		prev = null;
		next =null;
	}
}

class DoublyLinkedList{
	static Node head = null;
	static Node first = null;
	static Node tail = null;
	static Node temp = null;
	static int i = 0;
	
	//Add a Node 
	static void addNode(int k){
		Node ptr = new Node();
		//assign key
		ptr.key = k;		
		//next and prev ptr to null
		ptr.next = null;
		ptr.prev = null;		
		//if linked list is empty
		if( head == null) {
			head = ptr;
			first = head;
			tail = head;
		}else { //insert at the end of the linkedlist
			temp = ptr;
			first.next = temp;
			temp.prev = first;
			first = temp;
			tail = temp;			
		}
		//increment the number of node
		i++;
	}
	
	//traverse the list
	static void traverse(){
		//Nodes points towords head node
		Node ptr = head;
		//while ptr in not null, traverse and print node 
		while( ptr != null) {
			System.out.print(ptr.key + " ");
			ptr = ptr.next;
		}
		System.out.println();		
	}
	
	//insert a node at the beginning
	static void insertAtBeginning(int k) {		
		Node ptr = new Node();
		ptr.key = k;
		ptr.next = null;
		ptr.prev = null;
		
		if(head == null) {
			first = ptr;
			first = head;
			tail = head;
		} else { //insert node at beginning and 
			//change the head to current node
			temp = ptr;
			temp.next = head;
			head.prev = temp;
			head = temp;			
		}
		i++;
	}
	//insert a node at the end
	static void insertAtEnd(int k) {
		Node ptr = new Node();
		ptr.key = k;
		ptr.next = null;
		ptr.prev = null;
		
		if(head == null) {
			first = ptr;
			first = head;
			tail = head;
		} else { //insert node at beginning and 
			//change the head to current node
			temp = ptr;
			temp.prev = tail;
			tail.next = temp;
			tail = temp;			
		}
		i++;
		
	}
}
public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.addNode(10);
		dll.addNode(20);
		dll.addNode(30);
		dll.addNode(40);
		dll.addNode(50);
		dll.addNode(60);
		dll.addNode(70);
		dll.addNode(80);
		dll.addNode(90);
		dll.addNode(100);
		
		dll.traverse();
		
		dll.insertAtBeginning(110);
		
		dll.traverse();
		
		dll.insertAtEnd(120);
		
		dll.traverse();
		
	}

}
