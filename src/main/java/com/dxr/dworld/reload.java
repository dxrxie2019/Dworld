package com.dxr.dworld;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

public class reload implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Plugin config = com.dxr.dworld.Dworld.getProvidingPlugin(com.dxr.dworld.Dworld.class);
        config.reloadConfig();
        sender.sendMessage(ChatColor.YELLOW + "[Dworld]" + ChatColor.GREEN + "配置文件重载完毕!");
        return false;
        }
    }
