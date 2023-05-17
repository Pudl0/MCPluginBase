package org.example;

import net.kyori.adventure.text.Component;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public record Commands(Main main) implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String label, String[] args) {
        Player p = (Player) sender;
        if (args.length == 0)
            p.sendMessage(Component.text("[minecraftMod]" + ChatColor.RED + "Hello World! :D"));
        return false;
    }
}
