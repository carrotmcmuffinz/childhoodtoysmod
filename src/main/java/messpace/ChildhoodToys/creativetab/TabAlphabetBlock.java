package messpace.ChildhoodToys.creativetab;

import messpace.ChildhoodToys.common.ChildhoodToys;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabAlphabetBlock extends CreativeTabs{

	public TabAlphabetBlock(int par1, String par2Str) {
		super(par1, par2Str);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return ChildhoodToys.AlphabetPlaceholder;
	}

}
