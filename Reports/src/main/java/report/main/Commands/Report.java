package report.main.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import report.main.Main;
import report.main.Utils.Utils;


/**
 * Copy Right ©
 * This code is private
 * Owner: Christo
 * From: 10/22/19-2023
 * Any attempts to use these program(s) may result in a penalty of up to $1,000 USD
 **/

public class Report implements CommandExecutor {

    private Main plugin;

    public Report(Main plugin) {
        this.plugin = plugin;
        plugin.getCommand("report").setExecutor(this);
    }


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player p = (Player) sender;


        if(args.length == 0) {
            p.sendMessage(ChatColor.RED + "Usage: /report <player> {reason}");
            return true;
        }

        if(args.length == 1) {
            p.sendMessage(ChatColor.RED + "Usage: /report <player> {reason}");
            return true;
        }

        if(args.length > 1) {
            Player targetPlayer = Bukkit.getServer().getPlayer(args[0]);

            if(targetPlayer == null) {
                p.sendMessage(ChatColor.GRAY + "Could not find player " + ChatColor.AQUA + args[0] + ".");
                return true;
            }

            for(Player player: Bukkit.getOnlinePlayers()){
                if(player.hasPermission("reports.see")){
                    String msg = "";
                    for(int i = 1; i < args.length; i++) {
                        msg+=args[i] + " ";
                    }
                    msg = msg.trim();
                    player.sendMessage(Utils.chat("&b&m----------&f&m----------&b&m----------&r\n  &9New Report!\n  &7Player: &b" + args[0] + "\n" + "  &7Sender: &b"+ p.getName() + "\n  &7Reason: &b" + msg + "\n&b&m----------&f&m----------&b&m----------" ));
                } else {
                    p.sendMessage(Utils.chat("&bThank you! &7Your report has been submitted!"));
                }
            }
        }
        return true;
    }

}
