package Creadores.ninjacr.Emotions;

import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.utils.TextFormat;

public class BCommand extends Command {
    Main pl;

    public BCommand(Main pl) {
        super("e", "Express your emotions to everyone!", "Usage: /e");
        this.pl = pl;

    }

    @Override
    public boolean execute(CommandSender s, String label, String[] args) {
		if (!(s instanceof Player)) {
			s.sendMessage(TextFormat.RED + "You cannot use this command in the console!");
			return true;
		}
        Player p = (Player) s;
        String name = TextFormat.YELLOW + p.getName() + " ";
        String prefix = Utils.colors("§b(§eEmotions§b) ");

		if (args.length > 0) {
			switch (args[0].toLowerCase()) {
				case "help":
					p.sendMessage(Utils.colors("§5-------------------§eEmotions§5------------------------"));
					p.sendMessage(Utils.colors("§e/e crazy §f> §eUse it when you're angry"));
					p.sendMessage(Utils.colors("§e/e lol §f> §eUse it when you want to laugh"));
					p.sendMessage(Utils.colors("§e/e sad §f> §eUse it when you're sad"));
					p.sendMessage(Utils.colors("§e/e joy §f> §eUse it when you are happy"));
					p.sendMessage(Utils.colors("§e/e cry §f> §eUse it when you want to cry"));
					p.sendMessage(Utils.colors("§e/e happy §f> §eUse it when you are happy"));
					p.sendMessage(Utils.colors("§e/e sorry §f> §eUse it when you want to apologize"));
					p.sendMessage(Utils.colors("§e/e muse §f> §eUse it when you are thoughtful"));
					p.sendMessage(Utils.colors("§e/e obuda §f> §eUse it when you're offending"));
					p.sendMessage(Utils.colors("§e/e love §f> §eUse it when you are in love with someone"));
					p.sendMessage(Utils.colors("§e/e kick §f> §eUse it when you want to kick someone"));
					p.sendMessage(Utils.colors("§5-------------------§eEmotions§5------------------------"));
					break;
				case "crazy":
					Server.getInstance().broadcastMessage(prefix + "§6• " + name + "§fHe is angry!.");
					break;
				case "lol":
					Server.getInstance().broadcastMessage(prefix + "§6• " + name + "§fHe's laughing!.");
					break;
				case "sad":
					Server.getInstance().broadcastMessage(prefix + "§6• " + name + "§fHe is sad!.");
					break;
				case "joy":
					Server.getInstance().broadcastMessage(prefix + "§6• " + name + "§fIs rejoicing! :D.");
					break;
				case "cry":
					Server.getInstance().broadcastMessage(prefix + "§6• " + name + "§fIs crying.");
					break;
				case "happy":
					Server.getInstance().broadcastMessage(prefix + "§6• " + name + "§fIs happy! BD.");
					break;
				case "sorry":
					Server.getInstance().broadcastMessage(prefix + "§6• " + name + "§fApologizes!");
					break;
				case "muse":
					Server.getInstance().broadcastMessage(prefix + "§6• " + name + "§fHe is thinking.");
					break;
				case "obuda":
					Server.getInstance().broadcastMessage(prefix + "§6• " + name + "&fIs offended.");
					break;
				case "love":
					Server.getInstance().broadcastMessage(prefix + "§6• " + name + "§f is in love with someone!");
					break;
				case "kick":
					Server.getInstance().broadcastMessage(prefix + "§6• " + name + "§f kicked someone");
					break;
				default:
					p.sendMessage(Utils.colors("§cError: Use §f/e help"));
					break;
			}
		}else {
			p.sendMessage(Utils.colors("§cError: Use §f/e help"));
		}

        return false;
    }

}
