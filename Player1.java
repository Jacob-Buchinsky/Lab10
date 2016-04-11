import java.util.*;
public class Player1{
	public int hp = 100;
	public int mp = 3;
	
	public int rngDamage(){
		Random _rng = new Random();
		int r = _rng.nextInt((15)+1);
		return r;
	}
	public void displayStat(){
		System.out.println("HP = "+ hp + " MP = " + mp);
	}
			
	
}