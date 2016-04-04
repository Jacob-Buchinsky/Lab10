import java.util.*;
public class Lab11{
	
	 public static void main(String[] args){
		 Player player = new Player();
		 Monster enemy = rngMonster();
		 while(enemy._hp > 0 || player.hp > 0 ){
			 Combat(player, enemy);
		 }
		 
		 
	 }
	 public static Monster rngMonster(){
		Random _rng = new Random();
		int r = _rng.nextInt(11);
		if(r > 0 && r <= 4){
			System.out.println("A Goblin has appeared!");
			Monster g = new Goblin();
			return g;
		}
		else if(r > 4 && r <= 8){
			System.out.println("A Troll has Appeared!");
			Monster t = new Troll();
			return t;
		}
		else if(r > 8 && r <= 10){
			System.out.println("A Dragon has Appeared!");
			Monster d = new Dragon();
			return d;
		}
		return null;
	}
	public static void Combat(Player player, Monster enemy){
		int hit = 0;
		player.displayStat();
		Scanner scanner = new Scanner(System.in);
		System.out.println("(R)un/(A)ttack/(B)erserk/(M)agic");
		String s = scanner.nextLine().toUpperCase();
		char c = s.charAt(0);
		if(c == 'R'){
			enemy.attack(0);
			return;
		}
		else if(c == 'A'){
			hit = player.rngDamage();
			enemy.attack(hit);
			
		}
		else if(c == 'B'){
			hit = player.rngDamage();
			enemy.bAttack(hit);
		}
		else if(c == 'M'){
			player.hp = 100;
			player.mp--;
			System.out.println("You have been restored to full health");
		}
		
		
	}
}
