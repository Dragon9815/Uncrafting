package at.stegr.uncrafting.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class UncrafterSlot extends Slot{

	public UncrafterSlot(IInventory inventory, int slot, int x, int y) {
		super(inventory, slot, x, y);
	}
	
	@Override
	public boolean isItemValid(ItemStack p_75214_1_) {
		return false;
	}
	
	@Override
	public void onCrafting(ItemStack par1, int par2) {
		this.onCrafting(par1);
	}
	
	@Override
	public void onCrafting(ItemStack itemstack) {
		System.out.println("onCrafting");
	}
	
	@Override
	public void onSlotChange(ItemStack par1, ItemStack par2) {
		System.out.println("onSlotChange");
	}

}
