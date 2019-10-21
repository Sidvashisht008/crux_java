package gtihub_lecture16;

public class stack_using_queue extends dynamic_queue {
	dynamic_queue primary = new dynamic_queue();

	public void push(int item) {
		primary.enqueue(item);
	}

	public int pop() throws Exception {
		try {
			dynamic_queue helper = new dynamic_queue();
			for (int i = 0; i < primary.size - 1; i++) {
				helper.enqueue(primary.dequeue());
			}
			int temp = primary.dequeue();
			primary = helper;
			return temp;
		} catch (Exception e) {
			throw new Exception("Stack is empty");
		}
	}
}
