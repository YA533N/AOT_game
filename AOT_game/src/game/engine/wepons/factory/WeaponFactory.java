package game.engine.wepons.factory;

import java.util.HashMap;
import java.io.IOException;
import game.engine.dataloader.DataLoader;

public class WeaponFactory {
	private final HashMap<Integer,WeaponRegistry> weaponSho;
		
	public WeaponFactory() throws IOExceptions{
		weaponShop=DataLoader.readWeaponRegistry();
	}

	public HashMap<Integer, WeaponRegistry> getWeaponSho() {
		return weaponSho;
	}
	
}
