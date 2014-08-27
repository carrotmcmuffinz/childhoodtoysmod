package messpace.ChildhoodToys.block;

import messpace.ChildhoodToys.common.ChildhoodToys;
import messpace.ChildhoodToys.tileentity.TileEntityGlowStick;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GlowStick extends BlockContainer {

	public GlowStick(int i, Material p_i1700_1_) {
		super(p_i1700_1_);
		this.setCreativeTab(ChildhoodToys.Lighting);
	}
	
	
	@Override
	public int getRenderType() {
		return -1;
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	public boolean renderAsNormalBlock() {
		return false;
	}


	@Override
	public TileEntity createNewTileEntity(World arg0, int arg1) {
		// TODO Auto-generated method stub
		return new TileEntityGlowStick();
	}
	
	public void registerIcons(IconRegister icon) {
        this.blockIcon = icon.registerIcon("childhoodtoys:IconGlowStick");
}

}
