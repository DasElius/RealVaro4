import com.daselius.varo.eventlisteners.PlayerJoinListener;
import com.daselius.varo.session.GameSession;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * JavaDoc this file!
 * Created: 01.01.2019
 *
 * @author DasElius
 */
public class Varo extends JavaPlugin {

    private final GameSession session = new GameSession();

    @Override
    public void onEnable() {
        super.onEnable();

        getServer().getPluginManager().registerEvents( new PlayerJoinListener( session ), this );
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
