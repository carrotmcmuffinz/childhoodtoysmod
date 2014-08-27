package messpace.ChildhoodToys.block;

import messpace.ChildhoodToys.common.ChildhoodToys;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class AlphabetBlock extends Block{

	public AlphabetBlock(int i, Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setCreativeTab(ChildhoodToys.AlphabetBlocks);
		this.setHardness(0.5F);
		this.setResistance(0.5F);
	}

}
