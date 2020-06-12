package report.main.Commands;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 * Copy Right ©
 * This code is private
 * Owner: Christo
 * From: 10/22/19-2023
 * Any attempts to use these program(s) may result in a penalty of up to $1,000 USD
 **/

public class WelcomeMsg implements Listener {

    @EventHandler
    public void onHit(EntityDamageByEntityEvent e) {
        Player p = (Player) e.getDamager();

        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta swordMeta = item.getItemMeta();
        swordMeta.setDisplayName("LOL");

        if(((Player) e.getDamager()).getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("LOL")) {
            e.getEntity().getWorld().strikeLightningEffect(e.getEntity().getLocation());
            p.sendMessage("DIAMOND SWORD!");
        }
        //        event.getPlayer().getWorld().strikeLightningEffect(event.getPlayer().getLocation());
    }

    //lol

}
