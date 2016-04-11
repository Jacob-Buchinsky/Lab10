import java.util.*;
public class Lab11{
	static int run = 0;
	
	 public static void main(String[] args){
		 Player1 player = new Player1();
		 Hoard loot = new Hoard();
		 mainloop:
		 while(Dragon._defeats == 0){
			Monster enemy = rngMonster();
			while(enemy._hp > 0 || player.hp > 0 || run == 0 ){
				run = 0;
				Combat(player, enemy);
				System.out.println("Enemy HP: " + enemy._hp);
				if(run == 1)
					break;
				if(Dragon.win == 1)
					break mainloop;
				if(enemy._hp <= 0)
					break;
				if(player.hp <= 0){
					System.out.println("You Are Dead");
					break mainloop;
				}
				
				
			}
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
	public static void Combat(Player1 player, Monster enemy){
		int hit = 0;
		int playerDmg = 0;
		player.displayStat();
		Scanner scanner = new Scanner(System.in);
		System.out.println("(R)un/(A)ttack/(B)erserk/(M)agic");
		String s = scanner.nextLine().toUpperCase();
		char c = s.charAt(0);
		if(c == 'R'){
			playerDmg = enemy.attack(0);
			player.hp -= playerDmg;
			run = 1;
		}
		else if(c == 'A'){
			hit = player.rngDamage();
			playerDmg = enemy.attack(hit);
			player.hp -= playerDmg;
			
		}
		else if(c == 'B'){
			hit = player.rngDamage();
			playerDmg = enemy.bAttack(hit);
			player.hp -= playerDmg;
		}
		else if(c == 'M'){
			if(player.mp > 0){
			player.hp = 100;
			player.mp--;
			System.out.println("You have been restored to full health");
			}
			else{
				System.out.println("You are out of mana and unable to cast the spell!");
			}
		}
		
		
	}
}