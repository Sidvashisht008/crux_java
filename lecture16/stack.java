package github_lecture16;

public class stack {

	int[] data;
	int tos;

	public stack() {
		this.data = new int[5];
		this.tos = -1;
	}

	public stack(int cap) {
		this.data = new int[cap];
		this.tos = -1;
	}

	public void push(int item) {
		if (isFull()) {
			System.out.println("Stack full");
			return;
		}
		this.tos++;
		this.data[tos] = item;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack Empty");
			return -1;
		}
		int temp = this.data[tos];
		this.data[tos] = 0;
		this.tos--;
		return temp;
	}

	public boolean isEmpty() {
		if (this.tos == -1) {
			return true;
		}
		return false;
	}

	public int size() {
		return this.tos + 1;
	}

	public int peek() {
		return this.data[tos];
	}

	public boolean isFull() {
		return tos == this.data.length - 1;
	}

	public void display() {
		for (int i = tos; i >= 0; i--) {
			System.out.println(this.data[i]);
		}
	}
}
