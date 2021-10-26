package com.padfoot.firstplugin;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;


public class Main extends JavaPlugin implements Listener {

	@Override
	public void onEnable( ) {
		System.out.println("EVENTS PLUGIN ENABLED!");
		
		
		this.getConfig().options().copyDefaults();
		saveDefaultConfig();
		
		Bukkit.getPluginManager().registerEvents(this, this);
	}
	
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    	
    	Player player = (Player) sender;
    	
    	if (cmd.getName().equals("discord")) {
    		String word = this.getConfig().getString("Discord");
    		
    		player.sendMessage(ChatColor.GRAY + "Discord: " + word);
   	}
    	
    	return false;
    }
	  
}
