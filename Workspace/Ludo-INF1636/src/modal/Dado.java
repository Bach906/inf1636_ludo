package modal;
import java.util.concurrent.ThreadLocalRandom;


public class Dado {
	
	public static Dado instance;
	private int d1;
	
	public static Dado getInstance() {
		if (instance == null) {
			instance = new Dado();
		}
		return instance;
	}
	
	public int roll() {
		d1 = ThreadLocalRandom.current().nextInt(1, 7);
		return d1;
	}
	
	public int set_roll_value(int v1) {
		d1 = v1;
		return v1;
	}
}