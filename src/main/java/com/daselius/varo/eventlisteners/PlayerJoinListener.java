package com.daselius.varo.eventlisteners;

import com.daselius.varo.session.GameSession;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * JavaDoc this file!
 * Created: 01.01.2019
 *
 * @author DasElius
 */
public class PlayerJoinListener implements Listener {

    private final GameSession session;

    public PlayerJoinListener( final GameSession session) {
        this.session = session;
    }

    @EventHandler
    public void onPlayerJoin( PlayerJoinEvent event ) {

        if(session.isStarted() == false) {
            event.getPlayer().sendMessage( "Hey!" );
        }
    }

    public GameSession getGameSession() {
        return session;
    }
}
