import java.util.ArrayDeque;
import java.util.Deque;

public class SouthCars implements Runnable{
	
	private Bridge bridge;
	private Deque<Car> cars;
	
	
	 public SouthCars(Bridge bridge, int number ) {
		this.bridge = bridge;
		cars = new ArrayDeque<Car>();

		for(int i=0; i<number; i++) cars.add(new Car(i+1, "South"));
		
		 
	}

	@Override
	public void run() {
		while(!cars.isEmpty())
		{

			bridge.put(cars.poll());
			
			bridge.leave();
		}
		
	}

}
