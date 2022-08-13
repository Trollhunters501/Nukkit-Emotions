package Creadores.ninjacr.Emotions;

import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.utils.TextFormat;

public class BCommand extends Command{
	Main pl;
	
	public BCommand(Main pl) {
		super("e", "Expresa tus emociones a todos", "Usage: /e");
		this.pl = pl;
		
	}

	@Override
	public boolean execute(CommandSender s, String label, String[] args) {
		Player p = (Player)s;
		String name = TextFormat.YELLOW + p.getName()+" ";
		String prefix = Utils.colors("§b(§eEmotions§b) ");
		
	for(Player Player  : Server.getInstance().getOnlinePlayers().values()) {
		if(args.length > 0) {
			
		if(args[0].equalsIgnoreCase("help")) {
			p.sendMessage(Utils.colors("§5-------------------§eEmotions§5------------------------"));
			p.sendMessage(Utils.colors("§e/e crazy §f> §eUsalo cuándo estés enojado"));
			p.sendMessage(Utils.colors("§e/e lol §f> §eUsalo cuándo quieras reírte"));
			p.sendMessage(Utils.colors("§e/e sad §f> §eUsalo cuándo estés triste"));
			p.sendMessage(Utils.colors("§e/e joy §f> §eUsalo cuándo estés feliz"));
			p.sendMessage(Utils.colors("§e/e cry §f> §eUsalo cuándo quieras llorar"));
			p.sendMessage(Utils.colors("§e/e happy §f> §eUsalo cuándo estés feliz"));
			p.sendMessage(Utils.colors("§e/e sorry §f> §eUsalo cuándo quieras disculparte"));
			p.sendMessage(Utils.colors("§e/e muse §f> §eUsalo cuándo estés pensativo"));
			p.sendMessage(Utils.colors("§e/e obuda §f> §eUsalo cuándo está ofendido"));
			p.sendMessage(Utils.colors("§e/e love <Jugador> §f> §eUsalo cuándo estés enamorado de alguien"));
			p.sendMessage(Utils.colors("§e/e kick <Jugador> §f> §eUsalo cuándo quieras patear a alguien"));
			p.sendMessage(Utils.colors("§5-------------------§eEmotions§5------------------------"));
            
		}
		
		else if(args[0].equalsIgnoreCase("crazy")) {
			Server.getInstance().broadcastMessage(prefix + "§6• "+name+"§fEsta enojado!.");
		}
		else if(args[0].equalsIgnoreCase("lol")) {
			Server.getInstance().broadcastMessage(prefix + "§6• "+name+"§fSe esta riendo!.");
		}
		else if(args[0].equalsIgnoreCase("sad")) {
			Server.getInstance().broadcastMessage(prefix + "§6• "+name+"§fEstá triste!.");
		}
		else if(args[0].equalsIgnoreCase("joy")) {
			Server.getInstance().broadcastMessage(prefix + "§6• "+name+"§fEstá regocijandose! :D.");
			
		}
		else if(args[0].equalsIgnoreCase("cry")) {
			Server.getInstance().broadcastMessage(prefix + "§6• "+name+"§fEstá llorando.");

		}
		else if(args[0].equalsIgnoreCase("happy")) {
			Server.getInstance().broadcastMessage(prefix + "§6• "+name+"§fEstá feliz! BD.");

		}
		else if(args[0].equalsIgnoreCase("sorry")) {
			Server.getInstance().broadcastMessage(prefix + "§6• "+name+"§fSe disculpa!");
		}
		else if(args[0].equalsIgnoreCase("muse")) {
			Server.getInstance().broadcastMessage(prefix + "§6• "+name+"§fEstá pensando.");

		}
		else if(args[0].equalsIgnoreCase("obuda")) {
			Server.getInstance().broadcastMessage(prefix + "§6• "+name+"&fEstá ofendido.");

		}
		else if(args[0].equalsIgnoreCase("love")) {
            Player name2 = pl.getServer().getPlayer(args[1]);
            if(name2 !=null) {
				Server.getInstance().broadcastMessage(prefix + "§6• "+name+"§fEstá enamorado de §b "+name2.getName()+"§f.");
			}else{
				p.sendMessage(Utils.colors(prefix+"§fNo se encontro ese jugador!"));
			}
			
		}
		else if(args[0].equalsIgnoreCase("kick")) {
			Player name2 = pl.getServer().getPlayer(args[1]);
			
			if(name2 != null) {
				Server.getInstance().broadcastMessage((prefix + "§6• "+name+"§fPateó a §b "+name2.getName()+"§f."));
                
			}else{
				p.sendMessage(Utils.colors(prefix+"§fNo se encontro ese jugador!"));
			}
		
			}
        else{
			p.sendMessage(Utils.colors("§cError: Usa §f/e help"));
		}
		}
        }
        return false;
    }
    
}
