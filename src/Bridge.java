

import java.util.concurrent.BlockingQueue;

//HUUJ 2 dddd
import java.util.concurrent.LinkedBlockingQueue;


public class Bridge {

	private Car car;
	BlockingQueue<Car> queue = new LinkedBlockingQueue<Car>(1);
	
	
	 public void put (Car p) {
		 
		 
		 try {

			 queue.put(p);
			 System.out.println(p.toString() + " i wlasnie WJECHALEM na most");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public void leave () {
		try {
			car = queue.take();
			 System.out.println(car.toString() + " i wlasnie OPUSCILEM most");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		Bridge bridge = new Bridge();
		System.out.println("Pierwsza: " + bridge.queue.size() );
		new Thread(new SouthCars(bridge, 10)).start();
		new Thread(new NorthCars(bridge, 10)).start();		
	}

}
