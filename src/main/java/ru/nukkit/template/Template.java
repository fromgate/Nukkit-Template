package ru.nukkit.template;

import cn.nukkit.plugin.PluginBase;
import ru.nukkit.template.command.Commander;
import ru.nukkit.template.util.Cfg;
import ru.nukkit.template.util.Message;

public class Template extends PluginBase{

    private static Template instance;
    private Cfg cfg;

    public static Template getPlugin(){
        return instance;
    }
    public static Cfg getCfg(){
        return instance.cfg;
    }


    @Override
    public void onEnable(){
        instance = this;
        cfg = new Cfg();
        Message.init(this);
        Commander.init(this);


    }
}
