package report.main.Vouchers;

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
import report.main.Utils.Utils;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Copy Right ©
 * This code is private
 * Owner: Christo
 * From: 10/22/19-2023
 * Any attempts to use these program(s) may result in a penalty of up to $1,000 USD
 **/

public class Vouchers implements CommandExecutor {



    private Main plugin;

    public Vouchers(Main plugin) {
        this.plugin = plugin;
        plugin.getCommand("vouchers").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player p = (Player) sender;

        if(args[0].toLowerCase().equals("gladiator")) {
            ItemStack item = new ItemStack(Material.PAPER);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName(Utils.chat("&bGladiator &7Rank Voucher!"));
            ArrayList<String> lore = new ArrayList<String>();
            lore.add("test");
            itemMeta.setLore(lore);


            item.setItemMeta(itemMeta);
            p.getInventory().addItem(item);

        }





        return true;
    }


}
