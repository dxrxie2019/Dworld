package com.dxr.dworld;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

import java.util.Objects;

public class versioncheck implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Plugin config = com.dxr.dworld.Dworld.getProvidingPlugin(com.dxr.dworld.Dworld.class);
        String name = config.getConfig().getString("Config Version");
        String ms = config.getConfig().getString("ChestMessage");
        if (Objects.equals(name, String.valueOf(6))) {
            sender.sendMessage(ChatColor.YELLOW + "[Dworld]" + ChatColor.GREEN + "目前是最新版本!");
        } else {
            sender.sendMessage(ChatColor.YELLOW + "[Dworld]" + ChatColor.RED + "您的版本已落后!请删除配置文件后重启服务器!");
            return false;
        }
        return false;
    }
}

