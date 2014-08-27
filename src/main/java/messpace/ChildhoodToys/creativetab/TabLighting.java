package messpace.ChildhoodToys.creativetab;

import messpace.ChildhoodToys.common.ChildhoodToys;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabLighting extends CreativeTabs{

	public TabLighting(int par1, String par2Str) {
		super(par1, par2Str);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return ChildhoodToys.LightingPlaceholder;
	}

}
