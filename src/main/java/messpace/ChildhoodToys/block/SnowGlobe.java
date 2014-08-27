package messpace.ChildhoodToys.block;

import messpace.ChildhoodToys.common.ChildhoodToys;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SnowGlobe extends Block{

	public SnowGlobe(int i, Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setCreativeTab(ChildhoodToys.Lighting);
		this.setBlockBounds(0.25F, 0.0F, 0.25F, 0.75F, 0.50F, 0.75F);
		this.setHardness(0.5F);
		this.setResistance(0.1F);
		this.setLightLevel(0.4F);
	}
	
	public boolean isOpaqueCube() {
		return false;
	}

}
