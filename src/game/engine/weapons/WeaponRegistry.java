package game.engine.weapons;

public class WeaponRegistry {
	private final int code;
	private int price;
	private int damage;
	private String name; 
	private int minRange;
	private int maxRange;
	
	public WeaponRegistry(int code, int price){
		this.price=price;
		this.code=code;
	}
	public WeaponRegistry(int code, int price, int damage, String name){
		this.code=code;
		this.price=price;
		this.name=name;
	}
	public WeaponRegistry(int code, int price, int damage, String name, int minRange, int maxRange){
		this.code=code;
		this.price=price;
		this.damage=damage;
		this.name=name;
		this.minRange=minRange;
		this.maxRange=maxRange;
	}
}
