package gtihub_lecture16;

public class dynamic_stack extends stack {
	@Override
	public void push(int item) {
		if(isFull()) {
			int[] na =new int[2*data.length];
			for(int i=0;i<data.length;i++) {
				na[i]=data[i];
			}
			data=na;
		}
		super.push(item);
	}
}
