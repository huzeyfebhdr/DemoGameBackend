package Abstract;


import Entity.Game;
import Entity.Player;

public interface GameService {
    void add(Player player, Game game);
    void update(Player player,Game game);
    void delete(Player player,Game game);


}
