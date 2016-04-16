package ru.nukkit.template.util;

import cn.nukkit.utils.SimpleConfig;
import ru.nukkit.template.Template;

public class Cfg extends SimpleConfig {

    @Path("general.language")
    public static String language;

    @Path("general.language-save")
    public static boolean saveLanguage;

    @Path("general.debug")
    public static boolean debugMode;

    public Cfg() {
        super(Template.getPlugin());
    }
}
