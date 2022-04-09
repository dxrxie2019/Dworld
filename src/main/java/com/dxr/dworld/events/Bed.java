package com.dxr.dworld.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.plugin.Plugin;
import java.util.Objects;

public class Bed implements Listener {
    @EventHandler
    public void PlayerBedEnterEvent(PlayerBedEnterEvent Bed) {
        Bed.getPlayer().sendMessage(ChatColor.YELLOW+"[Dworld]"+ChatColor.GREEN+"检测到你点击床！");
        Plugin config = com.dxr.dworld.Dworld.getProvidingPlugin(com.dxr.dworld.Dworld.class);
        String name = config.getConfig().getString("Bed");
        if (Objects.equals(name, String.valueOf(true))) {
            Bed.setCancelled(true);
            Bed.getPlayer().sendMessage(ChatColor.YELLOW+"[Dworld]"+ChatColor.RED+"该服务器禁止睡觉!");
        }
        else {
            Bed.getPlayer().sendMessage(ChatColor.YELLOW+"[Dworld]"+ChatColor.GREEN+"此服务器允许睡觉。");
        }
    }
}
