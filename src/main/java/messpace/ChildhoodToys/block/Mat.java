package messpace.ChildhoodToys.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Mat extends Block{

	public Mat(int i, Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.05F, 1.0F);
		
	}
	
	public boolean isOpaqueCube(){
		return false;
	}

}
