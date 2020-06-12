package report.main.Trash;


import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import report.main.Main;

import static report.main.Trash.ChunkFinder.getMaterialAmount;


/**
 * Copy Right ©
 * This code is private
 * Owner: Christo
 * From: 10/22/19-2023
 * Any attempts to use these program(s) may result in a penalty of up to $1,000 USD
 **/
@SuppressWarnings("deprecation")
public class ChunkCmd implements CommandExecutor {

    private Main plugin;

    public ChunkCmd(Main plugin) {
        this.plugin = plugin;
        plugin.getCommand("chunkinfo").setExecutor(this);
    }

    @Override
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        long time = System.nanoTime();

        final int[] amount = getMaterialAmount(((Player) sender).getLocation().getChunk());

        time = System.nanoTime() - time;

        sender.sendMessage(ChatColor.GREEN + "TNT: " + Integer.toString(amount[Material.TNT.ordinal()]) + "!  (" + (time / 1000000.0D) + "ms)");
        return true;
    }
}













    /**
    @Override
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        long time = System.nanoTime();

        final int[] amount = getMaterialAmount(((Player) sender).getLocation().getChunk());

        time = System.nanoTime() - time;

        ItemStack item = new ItemStack(Material.TNT.ordinal());




        sender.sendMessage(ChatColor.GREEN + "CHEST: " + (amount[item]) + "!");

        return true;
    }


}
     **/
