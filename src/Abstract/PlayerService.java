package Abstract;

import Adaptor.CheckManager;
import Entity.Player;

public interface PlayerService {

    void add(Player player,CheckManager checkManager);
    void update(Player player);
    void delete(Player player);

}
