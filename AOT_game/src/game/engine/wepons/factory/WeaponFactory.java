package game.engine.wepons.factory;

import java.util.HashMap;
import java.io.IOException;
import game.engine.dataloader.DataLoader;
import game.engine.weapons.WeaponRegistry;

public class WeaponFactory {
	private final HashMap<Integer,WeaponRegistry> weaponShop;
		
	public WeaponFactory() throws IOException{
		weaponShop = DataLoader.readWeaponRegistry();
	}

	public HashMap<Integer, WeaponRegistry> getWeaponSho() {
		return weaponShop;
	}
	
}
