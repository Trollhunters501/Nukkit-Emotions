var prefix2em = "[Emotions-CREA-Edition] ";
var prefixem = "§b[§aCreadores§b] ";
function onEnable(){
    logger.info(prefix2em + "§eCargando...");
    manager.createCommand("e", "Express your Feelings with a Command!, Expresar tus Sentimientos con un Comando!", "emotionsCommand");
    logger.info(prefix2em + "§aCargado!");
}
onEnable();
function emotionsCommand(sender, args){
    if(args.length < 1){
        sender.sendMessage("§cUsa /e help para ver los Comandos!\n§cUse /e help to see the Commands!");
        return;
    }
    var subCommandem = args[0];
    var nameEm = sender.getName();
    switch(subCommandem){
            case "help":
              sender.sendMessage("§5-------------------§eEmotions§5------------------------\n§e/e crazy §f> §eUsalo cuándo estés enojado/Use it when you're angry\n§e/e lol §f> §eUsalo cuándo quieras reírte/Use it when you want to laugh\n§e/e sad §f> §eUsalo cuándo estés triste/use it when you are sad\n§e/e joy §f> §eUsalo cuándo estés feliz/use it when you are happy\n§e/e cry §f> §eUsalo cuándo quieras llorar/Use it when you want to cry\n§e/e happy §f> §eUsalo cuándo estés feliz/use it when you are happy\n§e/e sorry §f> §eUsalo cuándo quieras disculparte/Use it when you want to apologize\n§e/e muse §f> §eUsalo cuándo estés pensativo/Use it when you are pensive\n§e/e obuda §f> §eUsalo cuándo está ofendido/Use it when offended\n§e/e love §f> §eUsalo cuándo estés enamorado de alguien/Use it when you're in love with someone\n§e/e kick §f> §eUsalo cuándo quieras patear a alguien/Use it when you want to kick someone\n§5-------------------§eEmotions§5------------------------");
             break;
            case "crazy":
            server.broadcastMessage(prefixem + "§6• " + nameEm + " §fEsta enojado!/He's angry!.");
             break;
            case "lol":
             server.broadcastMessage(prefixem + "§6• " + nameEm + " §fSe esta riendo!/He's laughing!.");
             break;
            case "sad":
             server.broadcastMessage(prefixem + "§6• " + nameEm + " §fEstá triste!/He is sad!.");
             break;
            case "joy":
             server.broadcastMessage(prefixem + "§6• " + nameEm + " §fEstá regocijandose!/He is rejoicing! :D.");
             break;
            case "cry":
             server.broadcastMessage(prefixem + "§6• " + nameEm + " §fEstá llorando/Is crying.");
             break;
            case "happy":
             server.broadcastMessage(prefixem + "§6• " + nameEm + " §fEstá feliz!/Is happy! BD.");
             break;
            case "sorry":
             server.broadcastMessage(prefixem + "§6• " + nameEm + " §fSe disculpa!/Apologizes!");
             break;
            case "muse":
            server.broadcastMessage(prefixem + "§6• " + nameEm + " §fEstá pensando/He is thinking.");
             break;
            case "obuda":
             server.broadcastMessage(prefixem + "§6• " + nameEm + " §fEstá ofendido.");
             break;
            case "love":
             server.broadcastMessage(prefixem + "§6• " + nameEm + "§fEstá enamorado de §bAlguien§f/Is in love with §bsomeone§f.");
             break;
            case "kick":
             server.broadcastMessage(prefixem + "§6• " + nameEm + "§fPateó a §bAlguien§f/I kick §bsomeone.");
             break;
            default:
            
            sender.sendMessage("§cUsa /e help para ver los Comandos!\n§cUse /e help to see the Commands!");
            break;
    }
}