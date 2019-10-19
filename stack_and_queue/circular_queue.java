package gtihub_lecture16;

public class circular_queue {
	int[] data;
	int front;
	int size;

	public circular_queue() {
		data = new int[5];
		front = 0;
		size = 0;
	}

	public circular_queue(int cap) {
		data = new int[cap];
		front = 0;
		size = 0;
	}

	public void enqueue(int item) {
		if (isFull()) {
			System.out.println("queue is full");
			return;
		}
		this.data[(front + size)%data.length] = item;
		size++;
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("queue is empty");
			return -1;
		}
		int temp = this.data[front];
		this.data[front] = 0;
		front=(front+1)%data.length;
		size--;
		return temp;
	}

	public boolean isFull() {
		return size == data.length;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void display() {
		for (int i = front; i < front + size; i++) {
			int indx=i%data.length;
			System.out.print(data[indx] + " ");
		}
	}

	public int getFront() {
		if (isEmpty()) {
			System.out.println("Stack is Full");
			return -1;
		}
		return this.data[front];
	}
}
