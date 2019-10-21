package LinkedList;

public class linked_list {
	class Node {
		int val;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public boolean isEmpty() {
		return head == null;
	}

	public int getFirst() throws Exception {
		if (isEmpty()) {
			throw new Exception("LL is Empty");
		}

		return head.val;
	}

	public int getLast() throws Exception {
		if (isEmpty()) {
			throw new Exception();
		}
		return tail.val;
	}

	public void addLast(int item) {
		Node nn = new Node();
		nn.val = item;
		if (isEmpty()) {
			tail = nn;
			head = nn;
			size++;
		} else {
			tail.next = nn;
			tail = nn;
			size++;
		}
	}

	public void addFirst(int item) {
		Node nn = new Node();
		nn.val = item;
		if (isEmpty()) {
			tail = nn;
			head = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}
	}

	public void display() {
		Node temp = head;
		for (int i = 0; i < size; i++) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}

	}

	public int getAt(int indx) throws Exception {
		if (indx < 0 || indx >= size) {
			throw new Exception("Invalid indx");
		}
		if (isEmpty()) {
			throw new Exception("LL is Empty");
		}

		Node temp = head;
		for (int i = 0; i < indx; i++) {
			temp = temp.next;
		}
		return temp.val;
	}

	public Node getAtnode(int indx) throws Exception {
		if (indx < 0 || indx >= size) {
			throw new Exception("Invalid indx");
		}
		if (isEmpty()) {
			throw new Exception("LL is Empty");
		}
		Node temp = head;
		for (int i = 0; i < size; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void Addat(int item, int indx) throws Exception {
		if (indx < 0 || indx >= size) {
			throw new Exception("Invalid indx");
		}
		if (indx == 0) {
			addFirst(item);
		} else if (indx == size) {
			addLast(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			Node prev = getAtnode(indx - 1);
			nn.next = prev.next;
			prev.next = nn;
			size++;
		}
	}

	public void removeFirst() throws Exception {
		if (isEmpty()) {
			throw new Exception("LL is Empty");
		}
		if (size == 1) {
			tail = null;
			head = null;
			size--;
		} else {
			head = head.next;
			size--;
		}
	}

	public void removeLast() throws Exception {
		if (isEmpty()) {
			throw new Exception("LL is Empty");
		}
		if (size == 1) {
			tail = null;
			head = null;
			size--;
		}
		else {
			Node nn=getAtnode(size-2);
			nn.next=null;
			tail=nn;
			size--;
		}
	}

	public void removeAt(int indx) throws Exception{
		if (isEmpty()) {
			throw new Exception("LL is Empty");
		}
		if(indx<0 || indx>=size) {
			throw new Exception("Invalid synatx");
		}
		if(indx==0) {
			removeFirst();
		}
		else if(indx==size-1) {
			removeLast();
		}
		else {
			Node prev=getAtnode(indx-1);
			Node curr=prev.next;
			Node ahead=curr.next;
			prev.next=ahead;
			size--;
		}
	}
}
