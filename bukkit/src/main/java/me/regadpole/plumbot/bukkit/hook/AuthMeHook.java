package me.regadpole.plumbot.bukkit.hook;

import fr.xephi.authme.api.v3.AuthMeApi;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import taboolib.common.platform.function.IOKt;

public class AuthMeHook {

    public static Boolean hasAuthMe;
    public static AuthMeApi authMeApi;

    public static void hookAuthme() {

        Plugin authMe = Bukkit.getPluginManager().getPlugin("AuthMe");
        try {
            if (authMe != null) {
                hasAuthMe = true;
                authMeApi = AuthMeApi.getInstance();
                IOKt.info("AuthMe 关联成功");
            }else{
                hasAuthMe = false;
                IOKt.info("AuthMe 关联失败");
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
