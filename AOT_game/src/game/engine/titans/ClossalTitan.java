package game.engine.titans;

public class ClossalTitan extends Titan{
	
	
	private final int TITAN_CODE=4;
	public ClossalTitan(int baseHealth, int baseDamage, int heightInMeters, int distanceFromBase,
			int speed, int resourcesValue, int dangerLevel){
		super(baseHealth,baseDamage,heightInMeters,distanceFromBase,
				speed,resourcesValue,dangerLevel);
	}
	@Override
	public int compareTo(Titan o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
