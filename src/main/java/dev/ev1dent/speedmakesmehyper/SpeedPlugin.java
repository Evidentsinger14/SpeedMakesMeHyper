package dev.ev1dent.speedmakesmehyper;

import dev.ev1dent.speedmakesmehyper.commands.CommandSpeed;
import org.bukkit.plugin.java.JavaPlugin;

public final class SpeedPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
       this.getCommand("speed").setExecutor(new CommandSpeed());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
