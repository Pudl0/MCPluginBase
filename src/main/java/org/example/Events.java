package org.example;

import net.kyori.adventure.text.Component;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public record Events(Main main) implements Listener {
    //onJoin wird aufgerufen, wenn ein Spieler den Server betritt
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        e.joinMessage(null);
        if (p.hasPermission("minecraftMod.admin")) {
            p.sendMessage(Component.text("[minecraftMod]" + ChatColor.DARK_PURPLE + "Du bist ein Admin"));
        }
    }
    //onBedEnter wird gerufen, sobald ein Spieler sich in ein Bett legt
    @EventHandler
    public void onBedEnter(PlayerBedEnterEvent e) {
        Player p = e.getPlayer();
        if (p.hasPermission("minecraftMod.admin")) {
            p.sendMessage(Component.text("[minecraftMod]" + ChatColor.DARK_PURPLE + "Gute Nacht! :)"));
        }
    }
    //onBedLeave wird gerufen, sobald ein Spieler wieder aus einem Bett aufsteht.
    @EventHandler
    public void onBedLeave(PlayerBedLeaveEvent e) {
        Player p = e.getPlayer();
        if (p.hasPermission("minecraftMod.admin")) {
            p.sendMessage(Component.text("[minecraftMod]" + ChatColor.DARK_PURPLE + "Guten Morgen! :) " + p.getName()));
        }
    }
}
