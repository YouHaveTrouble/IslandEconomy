package pl.laststation.youhavetrouble.isbank.langmodule;

import org.bukkit.entity.Player;
import pl.laststation.youhavetrouble.isbank.isbank;

public class lang {

    /**
     *
     * @param p Player of whom locale we're getting
     * @param msg Message string
     * @param msgdefault Default message in case translation string does not exist in config file
     * @return Message translated to language based on player's locale
     */
    public static String getTranslatedString(Player p, String msg, String msgdefault) {

        String plocale = p.getLocale();
        String tmessage = isbank.getPlugin().getConfig().getString("lang." + plocale + "." + msg);
        if (tmessage == null) {
            return msgdefault;
        } else {
            return tmessage;
        }
    }

    public static class translate {
        public static translate translate;
        public translate() {
            this.translate = this;
        }
    }

}
