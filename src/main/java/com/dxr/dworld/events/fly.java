package com.dxr.dworld.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.plugin.Plugin;
import java.util.Objects;

public class fly implements Listener {
    @EventHandler
    public void PlayerToggleFightEvent(PlayerToggleFlightEvent fly) {
        fly.getPlayer().sendMessage(ChatColor.YELLOW + "[Dworld]" + ChatColor.GREEN + "检测到飞行！");
        Plugin config = com.dxr.dworld.Dworld.getProvidingPlugin(com.dxr.dworld.Dworld.class);
        String name = config.getConfig().getString("Fly");
        if (Objects.equals(name, String.valueOf(true))) {
            fly.setCancelled(true);
            fly.getPlayer().sendMessage(ChatColor.YELLOW + "[Dworld]" + ChatColor.RED + "服务器禁止飞行,已阻止飞行！");
        }
        else {
            fly.getPlayer().sendMessage(ChatColor.YELLOW+"[Dworld]"+ChatColor.GREEN+"此服务器允许飞行。");
        }
    }
}
