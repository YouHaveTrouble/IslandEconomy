package pl.laststation.youhavetrouble.isbank.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pl.laststation.youhavetrouble.isbank.isbank;
import pl.laststation.youhavetrouble.isbank.langmodule.lang;

public class isbankCommand implements CommandExecutor {

    public isbankCommand(isbank plugin) {
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {

        new lang.translate();

            if (args.length > 1) {
                commandSender.sendMessage("Too many arguments");
                return true;
            } else if (args.length == 1) {
                if ("info".equalsIgnoreCase(args[0])) {

                    Player p = (Player) commandSender;
                    commandSender.sendMessage(lang.getTranslatedString(p, "main-command-info-header", "-------- IslandEconomy Help --------"));
                    commandSender.sendMessage("/isbank info - " + lang.getTranslatedString(p, "main-command-info-desc", "shows this message"));
                    return true;
                }
                Player p = (Player) commandSender;
                commandSender.sendMessage(lang.getTranslatedString(p, "main-command-invalid-argument", "Invalid argument"));
                return true;

            }
            commandSender.sendMessage("IsBank v1.0.0 by YouHaveTrouble");
            return true;


    }
}