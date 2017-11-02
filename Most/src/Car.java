
public class Car {
	
	private int id;
	private String kierunek;
	
	public Car(int id, String kierunek)
	{
		this.id = id;
		this.kierunek = kierunek;
	}
	
	public String toString()
	{
		return ("Jestem autem z id " + id + ", jadê z " + kierunek );
	}

}
