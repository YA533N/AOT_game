package game.engine.weapons;

public class PiercingCannon extends Weapon{
		
		private final int WEAPON_CODE=1;		
		
		public PiercingCannon(int baseDamage){
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
