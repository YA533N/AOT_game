package game.engine.weapons;

public class VolleySpreadCannnon extends Weapon {
	
	private final int WEAPON_CODE=3;		
	private final int minRange;
	private final int maxRange;
	
	public VolleySpreadCannnon (int baseDamage,int minRange,int maxRange){
		super(baseDamage);
		this.minRange=minRange;
		this.maxRange=maxRange;
		
	}

	@Override
	public int getCurrentHealth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setCurrentHealth(int health) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getResourcesValue() {
		// TODO Auto-generated method stub
		return 0;
	}

}
