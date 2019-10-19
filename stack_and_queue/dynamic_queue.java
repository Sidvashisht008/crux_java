package gtihub_lecture16;

public class dynamic_queue extends circular_queue{
	@Override
	public void enqueue(int item) {
		if (isFull()) {
			int[] na =new int[2*data.length];
			int j=0;
			for(int i=front;i<size+front;i++) {
				int indx=i%data.length;
				na[j]=data[indx];
				j++;
			}
			data=na;
		}
		super.enqueue(item);
	}
}
