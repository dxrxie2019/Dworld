package com.dxr.dworld.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;



public class maincommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            sender.sendMessage(ChatColor.YELLOW + "[Dworld]" + ChatColor.GREEN + "插件版本:Dworld v0.0.4 build 03 作者:MC铁杆联盟dxr_xie2019");
            sender.sendMessage(ChatColor.YELLOW + "[Dworld]" + ChatColor.GREEN + "/cd:打开菜单 /dworld查看帮助 /dversion:检查版本 /dreload:重载配置文件");
        } else {
            sender.sendMessage(ChatColor.YELLOW + "[Dworld]" + ChatColor.RED + "语法错误！用法:/cd或/dworld或/dversion或/dreload");
        }
        return false;
    }
}





