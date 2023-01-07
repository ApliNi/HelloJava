package aplini.test.event;

import aplini.test.Util.Util;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerJoin implements Listener {

    // 将语言文件中的变量名替换为变量
    public String varRealization(String message, Player $player){
        return message
            .replace("{player.name}", $player.getName())
        ;
    }

    // 玩家加入事件
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player $player = event.getPlayer();

        // 广播加入消息
        if(!Util.fromConfig("player-join.broadcast").equals("")){
            event.setJoinMessage(varRealization(Util.fromConfig("player-join.broadcast"), $player));
        }else{
            event.setJoinMessage(null);
        }
    }


    // 玩家退出事件
    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        Player $player = event.getPlayer();

        // 广播退出消息
        if(!Util.fromConfig("player-quit.broadcast").equals("")){
            event.setQuitMessage(varRealization(Util.fromConfig("player-quit.broadcast"), $player));
        }else{
            event.setQuitMessage(null);
        }
    }

}
