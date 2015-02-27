package at.stegr.uncrafting.handler;

import at.stegr.uncrafting.gui.GuiUncrafter;
import at.stegr.uncrafting.inventory.ContainerUncrafter;
import at.stegr.uncrafting.tile_entity.TileEntityUncrafter;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == 0) {
			TileEntityUncrafter tileentityuncrafter = (TileEntityUncrafter)world.getTileEntity(x, y, z);
			return new ContainerUncrafter(player, tileentityuncrafter);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == 0) {
			TileEntityUncrafter tileentityuncrafter = (TileEntityUncrafter)world.getTileEntity(x, y, z);
			return new GuiUncrafter(player, tileentityuncrafter);
		}
		return null;
	}

}
