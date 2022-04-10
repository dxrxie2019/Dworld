package com.dxr.dworld;

import com.dxr.dworld.chest.gui;
import com.dxr.dworld.chest.guicheck;
import com.dxr.dworld.commands.maincommand;
import com.dxr.dworld.events.Bed;
import com.dxr.dworld.events.fish;
import com.dxr.dworld.events.fly;
import org.bukkit.plugin.java.JavaPlugin;

public final class Dworld extends JavaPlugin {

    @Override
    public void onEnable() {
        // 插件开始加载
        System.out.println("[Dworld]插件成功加载！");
        getServer().getPluginManager().registerEvents(new fish(),this);
        getServer().getPluginManager().registerEvents(new fly(),this);
        getServer().getPluginManager().registerEvents(new Bed(),this);
        getServer().getPluginManager().registerEvents(new guicheck(),this);
        getCommand("dworld").setExecutor(new maincommand());
        getCommand("cd").setExecutor(new gui());
        getCommand("dversion").setExecutor(new versioncheck());
        getCommand("dreload").setExecutor(new reload());
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        // 卸载插件
        System.out.println("[Dworld]插件已卸载！");
    }
}

