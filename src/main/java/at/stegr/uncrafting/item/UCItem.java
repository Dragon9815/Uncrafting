package at.stegr.uncrafting.item;

import cpw.mods.fml.common.registry.GameRegistry;
import at.stegr.uncrafting.main.Uncrafting;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class UCItem {

	public static void mainRegistry() {
		initializeItems();
		registerItems();
	}
	
	public static Item UncraftingUpgrade;
	
	public static void initializeItems() {
		UncraftingUpgrade = new ItemUncraftingUpgrade().setUnlocalizedName("uncrafting_upgrade").setCreativeTab(CreativeTabs.tabRedstone);
	}
	
	public static void registerItems() {
		GameRegistry.registerItem(UncraftingUpgrade, "uncrafting_upgrade");
	}

}
