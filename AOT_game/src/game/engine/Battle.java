package game.engine;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.PriorityQueue;

import game.engine.base.Wall;
import game.engine.dataloader.DataLoader;
import game.engine.lanes.Lane;
import game.engine.titans.Titan;
import game.engine.titans.TitanRegistry;
import game.engine.wepons.factory.WeaponFactory;

public class Battle {
	private static final int[][]PHASES_APPROACHING_TITANS= {{1,1,1,2,1,3,4},{2,2,2,1,3,3,4},{4,4,4,4,4,4,4}}
	private static final int WALL_BASE_HEALTH=10000;
	
	private int numberOfTurns;
	private int resourcesGathered;
	private BattlePhase battlePhase;
	private int numberOfTitansPerTurn;
	private int score;
	private int titanSpawnDistance;
	private final WeaponFactory weaponFactory;
	private final HashMap<Integer,TitanRegistry> titansArchives;
	private final ArrayList<Titan> approachingTitans;
	private final PriorityQueue<Lane>lanes;
	private final ArrayList<Lane>originalLanes;
	
	public Battle(int numberOfTurns, int score, int titanSpawnDistance, int initialNumOfLanes, int initialResourcesPerLane) throws IOException {
        this.numberOfTurns = numberOfTurns;
        this.score = score;
        this.titanSpawnDistance = titanSpawnDistance;
        this.weaponFactory = new WeaponFactory(); // Assuming WeaponFactory class is implemented
        this.titansArchives = DataLoader.readTitanRegistry();
        this.approachingTitans = new ArrayList<>();
        this.lanes = new PriorityQueue<>();
        this.originalLanes = new ArrayList<>();
        
        initializeLanes(initialNumOfLanes);
	}
	private void initializeLanes(int numOfLanes) {
		for(int i=0;i<numOfLanes;i++) {
			Lane lane=new Lane(new Wall(WALL_BASE_HEALTH));
			lanes.add(lane);
			originalLanes.add(lane);
		}
	}
	public static int[][] getPhasesApproachingTitans() {
		return PHASES_APPROACHING_TITANS;
	}
	public static int getWallBaseHealth() {
		return WALL_BASE_HEALTH;
	}
	public int getNumberOfTurns() {
		return numberOfTurns;
	}
	public int getResourcesGathered() {
		return resourcesGathered;
	}
	public BattlePhase getBattlePhase() {
		return battlePhase;
	}
	public int getNumberOfTitansPerTurn() {
		return numberOfTitansPerTurn;
	}
	public int getScore() {
		return score;
	}
	public int getTitanSpawnDistance() {
		return titanSpawnDistance;
	}
	public WeaponFactory getWeaponFactory() {
		return weaponFactory;
	}
	public HashMap<Integer, TitanRegistry> getTitansArchives() {
		return titansArchives;
	}
	public ArrayList<Titan> getApproachingTitans() {
		return approachingTitans;
	}
	public PriorityQueue<Lane> getLanes() {
		return lanes;
	}
	public ArrayList<Lane> getOriginalLanes() {
		return originalLanes;
	}
	public void setNumberOfTurns(int numberOfTurns) {
		this.numberOfTurns = numberOfTurns;
	}
	public void setResourcesGathered(int resourcesGathered) {
		this.resourcesGathered = resourcesGathered;
	}
	public void setBattlePhase(BattlePhase battlePhase) {
		this.battlePhase = battlePhase;
	}
	public void setNumberOfTitansPerTurn(int numberOfTitansPerTurn) {
		this.numberOfTitansPerTurn = numberOfTitansPerTurn;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void setTitanSpawnDistance(int titanSpawnDistance) {
		this.titanSpawnDistance = titanSpawnDistance;
	}
	

}
