package Creadores.ninjacr.Emotions;

import cn.nukkit.command.CommandMap;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.event.Listener;

public class Main extends PluginBase implements Listener {
	public void onEnable() {
        this.getLogger().info("§eCargando...");
        this.getServer().getPluginManager().registerEvents(this, this);
		CommandMap cmd = this.getServer().getCommandMap();
		cmd.register("help", new BCommand(this));
        this.getLogger().info("§aCargado!");
		
	}
	public void onDisable() {
		this.getLogger().info("§cDesactivando...!");
        this.getLogger().info("§cDesactivado!");
	}
	
}
