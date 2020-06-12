package report.main.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import report.main.Main;
import report.main.Utils.Utils;

/**
 * Copy Right ©
 * This code is private
 * Owner: Christo
 * From: 10/22/19-2023
 * Any attempts to use these program(s) may result in a penalty of up to $1,000 USD
 **/


public class AdminChat implements CommandExecutor {

    private Main plugin;

    public AdminChat(Main plugin) {
        this.plugin = plugin;
        plugin.getCommand("ac").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {


        Player p = (Player) sender;
        if (args.length > 0) {
            String msg = "";
            for (int i = 0; i < args.length; i++) {
                msg += args[i] + " ";
            }

            String toSend = "";
            if (p.hasPermission("staff.admin")) {
                toSend = "&c&l<AC>&f &8[&cAdmin&8]&r " + p.getName() + ": &c&l" + msg;
            }
            if (p.hasPermission("staff.manager")) {
                toSend = "&c&l<AC>&f &8[&4Manager&8]&r " + p.getName() + ": &c&l" + msg;
            }
            if (p.hasPermission("staff.owner")) {
                toSend = "&c&l<AC>&f &8[&bOwner&8]&r " + p.getName() + ": &c&l" + msg;
            }


            for (Player player : Bukkit.getOnlinePlayers()) {
                if(!player.hasPermission("adminchat.see")) {
                    return true;
                }
                player.sendMessage(Utils.chat(toSend));
            }
        }
        return true;
    }
}