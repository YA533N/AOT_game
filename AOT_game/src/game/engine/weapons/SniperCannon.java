package game.engine.weapons;

public class SniperCannon extends Weapon{
	private final int WEAPON_CODE=2;		
	
	public SniperCannon (int baseDamage){
		super(baseDamage);
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
