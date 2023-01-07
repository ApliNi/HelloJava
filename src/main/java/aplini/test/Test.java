package aplini.test;

import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;

public class Test extends JavaPlugin {
    private static Test plugin;

    @Override
    public void onEnable() {
        plugin = this;
        // 保存默认配置
        plugin.saveDefaultConfig();
        // 加载配置
        plugin.getConfig();
        // 注册命令
        plugin.getCommand("testplugin").setExecutor(new aplini.test.command.Comment_testplugin());
        // 注册事件监听
        getServer().getPluginManager().registerEvents(new aplini.test.event.PlayerJoin(), this);

        // 启动完成
        System.out.println("插件已启动");
    }

    @Override
    public void onDisable() {
        // 注销所有事件监听器
        HandlerList.unregisterAll(this);

        // 关闭完成
        System.out.println("插件已关闭");
    }

    public static Test getInstance() {
        return plugin;
    }
}