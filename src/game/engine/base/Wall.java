package game.engine.base;
import game.engine.interfaces.Attackee;


public class Wall implements Attackee{
	
	private final int baseHealth;
	private int currentHealth;
	private final int resourcesValue=-1;
	
	public Wall(int baseHealth){
		this.baseHealth=baseHealth;
		this.currentHealth=baseHealth;
	}
	//gets and sets the current health of the base wall to equal 
	public int getCurrentHealth(){
		return currentHealth;
	}
	public void setCurrentHealth(int health){
		this.currentHealth=health;
	}
	@Override
	public int getResourcesValue() {
		// TODO Auto-generated method stub
		return 0;
	}

}
