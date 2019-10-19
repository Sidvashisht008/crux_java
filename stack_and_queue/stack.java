package gtihub_lecture16;
public class stack {
	int[] data;
	int tos;
	
	public stack() {
		data=new int[5];
		tos=-1;
	}
	public stack(int cap) {
		data=new int[cap];
		tos=-1;
	}
	public void push(int item) {
		if(isFull()) {
			System.out.println("Stack is Full");
			return;
		}
		tos++;
		this.data[tos]=item;
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		int temp=this.data[tos];
		this.data[tos]=0;
		tos--;
		return temp;
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		return this.data[tos];
	}
	public boolean isFull() {
		return tos==data.length-1;
	}
	public boolean isEmpty() {
		return tos+1==0;
	}
	public void display() {
		for(int i=tos;i>=0;i--) {
			System.out.print(this.data[i]+" ");
		}
	}
}
