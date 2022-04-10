package com.dxr.dworld.chest;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.plugin.Plugin;

import java.util.Objects;

public class guicheck implements Listener {
    @EventHandler
    public void check(InventoryClickEvent ch) {
        Plugin config = com.dxr.dworld.Dworld.getProvidingPlugin(com.dxr.dworld.Dworld.class);
        String c = config.getConfig().getString("ChestMessage");
        String b = config.getConfig().getString("ChestTip");
        Player p = (Player) ch.getWhoClicked();
        if (Objects.equals(b, String.valueOf(true))) {
            if (ch.getWhoClicked().getOpenInventory().getTitle().equals(c)) {
                p.sendMessage(ChatColor.YELLOW + "[Dworld]" + ChatColor.GREEN + "你打开了菜单!");
                ch.setCancelled(false);
            }
            if (ch.getRawSlot() > ch.getInventory().getSize()) {
                p.sendMessage(ChatColor.YELLOW + "[Dworld]" + ChatColor.GREEN + "你点击了菜单以外部分!");
                return;
            }
            if (ch.getRawSlot() < 0) {
                p.sendMessage(ChatColor.YELLOW + "[Dworld]" + ChatColor.GREEN + "你点击了空白部分!");
                return;
            }
            if (ch.getRawSlot() == 10) {
                p.sendMessage(ChatColor.YELLOW + "[Dworld]" + ChatColor.GREEN + "你取出了钻石!");
            }
            if (ch.getRawSlot() == 12) {
                p.chat("/home");
                p.closeInventory();
                p.sendMessage(ChatColor.YELLOW + "[Dworld]" + ChatColor.GREEN + "你使用dworld插件执行了/home指令!");
            } else if (ch.getRawSlot() == 11) {
                p.sendMessage(ChatColor.YELLOW + "[Dworld]" + ChatColor.GREEN + "你取出了基岩!");
            }
        }
    }
}