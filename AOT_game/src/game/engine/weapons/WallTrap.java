package game.engine.weapons;

public class WallTrap extends Weapon{
	private final int WEAPON_CODE=4;
	
	public WallTrap(int baseDamage){
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
