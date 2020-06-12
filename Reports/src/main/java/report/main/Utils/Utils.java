package report.main.Utils;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Utils {

    public static String chat (String s ) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }

    public static ItemStack createItem(Inventory inv, Material mat, int amount, int slot, String displayName, String... loreString) {
        return createItem(inv, mat, ((byte)0), amount, slot, displayName, loreString);
    }

    public static ItemStack createItem(Inventory inv, Material materialId, int byteId, int amount, int invSlot, String displayName, String... loreString) {

        ItemStack item;
        List<String> lore = new ArrayList();

        item = new ItemStack(materialId, amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.chat(displayName));
        for (String s : loreString) {
            lore.add(Utils.chat(s));
        }

        item.setItemMeta(meta);

        inv.setItem(invSlot - 1, item);
        return item;

    }






}
