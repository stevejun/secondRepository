
public class LinkedList {

	public static void main(String[] args) {
		
		//itemTierList will be our list head
		Node itemTierList = new Node();
		Node white = new Node(1,"white");
		Node green = new Node(2,"green");
		Node blue = new Node(3,"blue");
		Node purple = new Node(4,"purple");
		Node orange = new Node(5,"orange");
		
		Node.append(itemTierList, white);
		Node.append(itemTierList, green);
		Node.append(itemTierList, blue);
		Node.append(itemTierList, purple);
		Node.append(itemTierList, orange);
		
		Node.printList(itemTierList);
		
	}
}
