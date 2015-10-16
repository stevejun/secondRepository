/**
 * Sample Node class
 * 
 * @author Steve Jun
 */
public class Node {
	
	protected int id;
	protected String data;
	protected Node next;
	
	//default constructor
	public Node(){
		this.id = 0;
		this.data = null;
		this.next = null;
	}
	
	public Node(int id, String data){
		this.id = id;
		this.data = data;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	/*
	 * Given a list head, prints the data of every 
	 * node within the list in order.
	 */
	public static void printList(Node head){
		while(head.next!=null){
			System.out.print("["+head.next.id+"] "+head.next.data+"\t");
			head = head.next;
		}
	}
	
	/*
	 * Given a new node, appends the new node at the
	 * end of the list.
	 */
	public static void append(Node head, Node newNode){
		while(head.next!=null){
			head = head.next;
		}
		head.next=newNode;
		newNode.next=null;
	}
	
}
