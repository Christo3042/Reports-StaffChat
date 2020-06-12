package report.main.Trash;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import report.main.Main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Copy Right ©
 * This code is private
 * Owner: Christo
 * From: 10/22/19-2023
 * Any attempts to use these program(s) may result in a penalty of up to $1,000 USD
 **/

public class MobHopper implements Listener {

    private Main plugin;

    public MobHopper(Main plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onKill(EntityDeathEvent e) {


        Monster monster = (Monster) e.getEntity();
        Player p = (Player) e.getEntity().getKiller();
        Location loc = monster.getLocation();
        Block block = loc.getBlock();




        block.setType(Material.CHEST);
        Chest chest = (Chest) block.getState();
        Inventory chestInv = chest.getBlockInventory();

        ArrayList<ItemStack> newDrops = new ArrayList<>();
        for (ItemStack drop : e.getDrops()) {

            String str = loc.getChunk().toString();
            p.sendMessage(str);

            HashMap<Integer, ItemStack> remaining = chestInv.addItem(drop);
        }
        e.getDrops().clear();
    }
}

        /**if(block.getType().equals(Material.AIR)){

            block.setType(Material.CHEST);
            Chest chest = (Chest) block.getState();
            Inventory chestInv = chest.getBlockInventory();



            chestInv.addItem(item);

            e.getDrops().clear();
            p.getInventory().set



            int nullItems = 0;

**/
