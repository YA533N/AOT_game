package game.engine.weapons;

public class VolleySpreadCannnon extends Weapon {
	
	private static final int WEAPON_CODE=3;		
	private final int minRange;
	private final int maxRange;
	
	public VolleySpreadCannnon (int baseDamage,int minRange,int maxRange){
		super(baseDamage);
		this.minRange=minRange;
		this.maxRange=maxRange;
		
	}

	public int getMinRange() {
		return minRange;
	}

	public int getMaxRange() {
		return maxRange;
	}


}
