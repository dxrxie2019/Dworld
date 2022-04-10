package com.dxr.dworld.chest;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import java.util.Objects;

public class gui implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command,String label,String[] args) {
        Plugin config = com.dxr.dworld.Dworld.getProvidingPlugin(com.dxr.dworld.Dworld.class);
        String name = config.getConfig().getString("Chest");
        if (Objects.equals(name, String.valueOf(true))) {
            String c = config.getConfig().getString("ChestMessage");
            Inventory gui = Bukkit.createInventory(null, 6 * 9, c);
            ItemStack diamond = new ItemStack(Material.DIAMOND);
            gui.setItem(10, diamond);
            ItemStack bedrock = new ItemStack(Material.BEDROCK);
            gui.setItem(11, bedrock);
            ItemStack bed = new ItemStack(Material.BED);
            gui.setItem(12,bed);
            Player p = (Player) sender;
            p.openInventory(gui);
            return false;
        }
        else {
            sender.sendMessage(ChatColor.YELLOW+"[Doworld]"+ChatColor.RED+"此服务器未开启菜单功能！");
        }
        return false;
    }
}
