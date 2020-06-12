package report.main;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;
import report.main.Commands.*;
import report.main.Vouchers.VoucherListener;
import report.main.Vouchers.Vouchers;

import java.lang.reflect.Field;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        new Report(this);
        new StaffChat(this);
        new AdminChat(this);
        this.getServer().getPluginManager().registerEvents(new WelcomeMsg(), this);
        new Sticks(this);
        new Vouchers(this);
        this.getServer().getPluginManager().registerEvents(new VoucherListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
