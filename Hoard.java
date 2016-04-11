import java.util.*;

public class Hoard{
	public static int hoard = 0;
	public static int hoardTotal = 0;
	
	public static void addToHoard(){
	Random random = new Random();
	hoard = random.nextInt((100)+1);
	hoardTotal += hoard;
	}
	
	public static int getHoard(){
		return hoard;
	}
	public static int getHoardTotal(){
		return hoardTotal;
	}
}