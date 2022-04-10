package com.dxr.dworld.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.plugin.Plugin;
import java.util.Objects;


public class fish implements Listener {
    @EventHandler
    public void PlayerFishEvent(PlayerFishEvent fish) {
        fish.getPlayer().sendMessage(ChatColor.YELLOW + "[Dworld]" + ChatColor.GREEN + "检测到你扔出了鱼竿!");
        Plugin config = com.dxr.dworld.Dworld.getProvidingPlugin(com.dxr.dworld.Dworld.class);
        String name = config.getConfig().getString("Fish");
        String c = config.getConfig().getString("EventTip");
        if (Objects.equals(c, String.valueOf(true))) {
            if (Objects.equals(name, String.valueOf(true))) {
                fish.setCancelled(true);
                fish.getPlayer().sendMessage(ChatColor.YELLOW + "[Dworld]" + ChatColor.RED + "服务器禁止钓鱼！");
            } else {
                fish.getPlayer().sendMessage(ChatColor.YELLOW + "[Dworld]" + ChatColor.GREEN + "此服务器允许钓鱼。");
            }
        }
    }
}