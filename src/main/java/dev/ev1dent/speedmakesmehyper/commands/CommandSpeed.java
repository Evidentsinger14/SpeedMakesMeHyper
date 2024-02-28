package dev.ev1dent.speedmakesmehyper.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandSpeed implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        Player player = (Player) sender;
        if (args.length == 0) {
            sender.sendMessage("Please specify a speed multiplier.");
            return true;
        }
        float defaultSpeed = 0.2f;
        if(args[0].equalsIgnoreCase("reset")){
            player.sendMessage("Reset Speed");
            player.setWalkSpeed(defaultSpeed);
        }
        if(args[0].equalsIgnoreCase("query")){
            player.sendMessage(String.format("Current speed: %s", player.getWalkSpeed()));
        }
        if(args[0].equalsIgnoreCase("set")){
            int speedMultiplier = Integer.parseInt(args[1]);
            float speed = (defaultSpeed * speedMultiplier);
            player.sendMessage(String.format("Set walk speed to %sX.", speed));
            player.setWalkSpeed(speed);
        }
        return false;
    }
}
