package gtihub_lecture16;

public class queue {
	int[] data;
	int front;
	int size;
	public queue() {
		data=new int[5];
		front=0;
		size=0;
	}
	public queue(int cap) {
		data=new int[cap];
		front=0;
		size=0;
	}
	public void enqueue(int item) {
		if(isFull()) {
			System.out.println("queue is full");
			return;
		}
		this.data[front+size]=item;
		size++;
	}
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("queue is empty");
			return -1;
		}
		int temp=this.data[front];
		this.data[front]=0;
		front++;
		size--;
		return temp;
	}
	public boolean isFull() {
		return size==data.length;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public void display() {
		for(int i=front;i<front+size;i++) {
			System.out.print(data[i]+" ");
		}
	}
	public int getFront() {
		if(isEmpty()) {
		 System.out.println("Stack is Full");
		 return -1;
		}
		return this.data[front];
	}
}
