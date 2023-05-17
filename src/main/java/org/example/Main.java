package org.example;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;



public class Main extends JavaPlugin {
    //onEnable wird aufgerufen, sobald das Plugin geladen wurde. Die Ausgabe findest du in der Server Konsole
    @Override
    public void onEnable() {
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new Events( this), this);
        Objects.requireNonNull(getCommand("helloworld")).setExecutor(new Commands(this));
        Bukkit.getConsoleSender().sendMessage(Component.text(" [minecraftMod] " + "minecraftMod wurde geladen"));
    }
    //onDisable wird gerufen, sobald as Plugin entladen wird. zB beim Beenden des Servers. Die Ausgabe findest du ebenfalls in der Server Konsole.
    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(Component.text(" [minecraftMod] " + "minecraftMod wurde entladen"));
    }
}