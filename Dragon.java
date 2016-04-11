import java.util.*;

// This is an example Goblin class.  You do NOT need to use
// it if you don't want to, but it's certainly a good start.

// Also note that you may need additional methods or attributes!

public class Dragon extends Monster {

    // Total number of all Goblins defeated
    // Note that this is a STATIC variable as it applies
    // to the whole class of Goblins, not one particular one.
    
    public static int _defeats = 0;
	public static int win = 0;
    // Constructor.  Goblins have ten hit points.

    // Note that we are re-using the _hp variable from the
    // superclass Monster.
    
    public Dragon() {
	_hp = 100;
    }

    // Here, we are overriding the getName() method in Monster
    // by having it return "Goblin".
    
    public String getName() {
	return "Dragon";
    }

    // Calculate damage from a regular attack
    
    public int attack(int hit) {
	_hp -= hit;

	if (_hp <= 0) {
	    _defeats++;
		Hoard.addToHoard();
		System.out.println("You recieved " + Hoard.hoard + " gold pieces");
		System.out.println("YOU HAVE SLAIN THE DRAGON! YOU ARE WINNER");
		System.out.println("Goblins slain: " + Goblin._defeats + "\n" + "Trolls slain: " + Troll._defeats + "\n" + "Dragons slain: " + Dragon._defeats);
		System.out.println("You collected " + Hoard.hoardTotal + " gold pieces");
		win = 1;
		return win;
	}

	int damage = _rng.nextInt(20) + 1;
	
	return damage;
    }

    // Calculate damage from a berserk attack

    public int bAttack(int hit) {
	_hp -= (hit * 3);

	if (_hp <= 0) {
	    _defeats++;
		Hoard.addToHoard();
		System.out.println("You recieved " + Hoard.hoard + " gold pieces");
		System.out.println("YOU HAVE SLAIN THE DRAGON! YOU ARE WINNER");
		System.out.println("Goblins slain: " + Goblin._defeats + "\n" + "Trolls slain: " + Troll._defeats + "\n" + "Dragons slain: " + Dragon._defeats);
		System.out.println("You collected " + Hoard.hoardTotal + "gold pieces");
		win = 1;
		return win;
		
	}

	int damage = _rng.nextInt(20) + 1;
	
	return damage * 2;
    }

    
}