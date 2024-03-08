package game.engine.titans;

import game.engine.interfaces.Attackee;
import game.engine.interfaces.Attacker;
import game.engine.interfaces.Mobil;

public abstract class Titan implements Comparable<Titan>,Attackee,Attacker,Mobil {
	
	private final int baseHealth;
	private int currentHealth;
	private final int baseDamage;
	private final int heightInMeters;
	private int distanceFromBase;
	private int speed;
	private final int resourcesValue;
	private final int dangerLevel;
	
	public Titan(int baseHealth, int baseDamage, int heightInMeters, int distanceFromBase, int
			speed, int resourcesValue, int dangerLevel){
		
		this.baseHealth=baseHealth;
		this.currentHealth=baseHealth;
		this.baseDamage=baseDamage;
		this.heightInMeters=heightInMeters;
		this.distanceFromBase=distanceFromBase;
		this.speed=speed;
		this.resourcesValue=resourcesValue;
		this.dangerLevel=dangerLevel;
	}
	
	
	
	public int getBaseHealth() {
		return baseHealth;
	}
	//gets and sets current attackee health from the Attackee interface
	public int getCurrentHealth() {
		return currentHealth;
	}
	public void setCurrentHealth(int health){
		currentHealth=(health>=0)? health:0;
	}
	
	//gets BaseDamage from the attacker(titan)
	public int getDamage() {
		return baseDamage;
	}
	
	public int getHeightInMeters() {
		return heightInMeters;
	}
	//gets and sets the titan's distance from base using the mobil interface 
	public int getDistance() {
		return distanceFromBase;
	}
	public void setDistance(int distance){
		distanceFromBase=distance;
	}
	//gets and sets the speed of a titan from the mobil interface as well
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed){
		this.speed=speed;
	}
	
	//gets the resource value after defeating the titan from the attackee interface
	public int getResourcesValue() {
		return resourcesValue;
	}
	public int getDangerLevel() {
		return dangerLevel;
	}

	//compares the titans distance from the base wall
	public int comapareTo(Titan o){
		return this.distanceFromBase-o.getDistance();
	
	}
	

}
