package at.stegr.uncrafting.main;

import at.stegr.uncrafting.block.UCBlocks;
import at.stegr.uncrafting.handler.GuiHandler;
import at.stegr.uncrafting.item.UCItem;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

@Mod(name=Uncrafting.NAME, modid = Uncrafting.MODID, version = Uncrafting.VERSION)
public class Uncrafting
{
    public static final String MODID = "uncrafting";
    public static final String VERSION = "0.1";
    public static final String NAME = "Uncrafting";
    
    @Instance(value="")
    public static Uncrafting INSTANCE;
    
    @SidedProxy(serverSide="at.stegr.uncrafting.main.CommonProxy", clientSide="at.stegr.uncrafting.main.ClientProxy")
    public static CommonProxy proxy;
    
    private GuiHandler guihandler;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	guihandler = new GuiHandler();
    	
    	UCItem.mainRegistry();
		UCBlocks.mainRegistry();
		CraftingManager.mainRegistry();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		proxy.registerRenderers();
		proxy.registerTileEntities();
		NetworkRegistry.INSTANCE.registerGuiHandler(INSTANCE, guihandler);
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
		
    }
}
