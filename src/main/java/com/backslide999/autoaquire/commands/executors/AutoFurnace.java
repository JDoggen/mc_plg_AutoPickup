package com.backslide999.autoaquire.commands.executors;

import com.backslide999.autoaquire.AutoAquirePlugin;
import com.backslide999.autoaquire.commands.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class AutoFurnace implements CommandExecutor {

    private AutoAquirePlugin plugin;
    public AutoFurnace(AutoAquirePlugin plugin){
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if(args.length > 0){
            switch(args[0].toLowerCase()){
                case "help": {
                    new AutoAquireHelp(sender, args);
                    break;
                }
                case "on": {
                    new AutoFurnaceOn(sender, args);
                    break;
                }
                case "off": {
                    new AutoFurnaceOff(sender, args);
                    break;
                }
                default: {
                    new AutoAquireHelp(sender, args);
                    break;
                }
            }
        } else{
            new AutoFurnaceToggle(sender, args);
        }
        return true;
    }
}
