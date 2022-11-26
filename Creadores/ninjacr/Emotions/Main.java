package Creadores.ninjacr.Emotions;

import cn.nukkit.command.CommandMap;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.event.Listener;

public class Main extends PluginBase implements Listener {
	public void onEnable() {
        this.getLogger().info("§eLoading...");
        this.getServer().getPluginManager().registerEvents(this, this);
		CommandMap cmd = this.getServer().getCommandMap();
		cmd.register("e", new BCommand(this));
        this.getLogger().info("§aLoaded!");
		
	}
	public void onDisable() {
		this.getLogger().info("§cDeactivating...!");
        this.getLogger().info("§cDisabled!");
	}
	
}
