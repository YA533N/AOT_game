package game.engine.lanes;

import game.engine.base.Wall;
import game.engine.titans.Titan;
import game.engine.weapons.Weapon;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Lane implements Comparable<Lane> {
	
	private final Wall laneWall;
	private int dangerLevel=0;
	private final PriorityQueue<Titan> titans;
	private final ArrayList<Weapon> weapons;
	
	public Lane(Wall LaneWall){
		this.laneWall=LaneWall;
		this.titans=new PriorityQueue<Titan>();
		this.weapons=new ArrayList<Weapon>();
	}

	public Wall getLaneWall() {
		return laneWall;
	}

	public int getDangerLevel() {
		return dangerLevel;
	}

	public PriorityQueue<Titan> getTitans() {
		return titans;
	}

	public ArrayList<Weapon> getWeapons() {
		return weapons;
	}

	
	public int compareTo (Lane o) {
		return dangerLevel-o.dangerLevel;
	}

	public void setDangerLevel(int dangerLevel) {
		this.dangerLevel = dangerLevel;
	}

	

	
	
	
	
	
}
