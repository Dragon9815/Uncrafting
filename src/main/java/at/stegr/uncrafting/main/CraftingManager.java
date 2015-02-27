package at.stegr.uncrafting.main;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import at.stegr.uncrafting.block.UCBlocks;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingManager {

	public static void mainRegistry() {
		addCraftingRecipes();
		addSmeltingRecipes();
	}
	
	public static void addCraftingRecipes() {
		GameRegistry.addShapedRecipe(new ItemStack(UCBlocks.BlockUncrafter), new Object[] {"IDI", "IWI", "III", 'I', Items.iron_ingot, 'W', Blocks.crafting_table, 'D', Blocks.diamond_block});
	}
	
	public static void addSmeltingRecipes() {
		
	}

}