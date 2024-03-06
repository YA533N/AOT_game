package game.engine.weapons;
import game.engine.interfaces.Attackee;

public abstract class Weapon implements Attackee{
	
	private final int baseDamage;
	
	public Weapon (int baseDamage){
		this.baseDamage=baseDamage;
	}
	//gets the damage the weapon does through attacker interface
	public int getDamage(){
		return baseDamage;
	}
		
}
