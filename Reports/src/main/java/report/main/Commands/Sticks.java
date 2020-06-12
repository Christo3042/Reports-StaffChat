package report.main.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import report.main.Main;

/**
 * Copy Right ©
 * This code is private
 * Owner: Christo
 * From: 10/22/19-2023
 * Any attempts to use these program(s) may result in a penalty of up to $1,000 USD
 **/

public class Sticks implements CommandExecutor {

    private Main plugin;

    public Sticks(Main plugin) {
        this.plugin = plugin;
        plugin.getCommand("sticks").setExecutor(this);
    }


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        ItemStack item = new ItemStack(Material.STICK);
        ItemMeta itemMeta = item.getItemMeta();
        Glow glow = new Glow(70);
        itemMeta.addEnchant(glow, 1, true);
        item.setItemMeta(itemMeta);

        Player p = (Player) sender;

        p.getInventory().addItem(item);
        p.updateInventory();
        p.sendMessage("success!");


        return true;

    }



    //lol

}
