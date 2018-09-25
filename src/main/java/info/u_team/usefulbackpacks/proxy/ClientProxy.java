package info.u_team.usefulbackpacks.proxy;

import info.u_team.usefulbackpacks.init.UsefulBackPacksColors;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.relauncher.*;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {
	
	public void preinit(FMLPreInitializationEvent event) {
		super.preinit(event);
	}
	
	public void init(FMLInitializationEvent event) {
		super.init(event);
		UsefulBackPacksColors.init();
	}
	
	public void postinit(FMLPostInitializationEvent event) {
		super.postinit(event);
	}
}