package Concrete;

import Abstract.GameService;
import Entity.Campaign;
import Entity.Game;
import Entity.Player;

public class GameManager implements GameService {


    public void add(Player player, Game game, Campaign campaign) {
        //kampanyalı fiyatı hesaplamayı burada yapıyorum.
        int newPrice = game.getPrice()-((campaign.getOran()*game.getPrice())/100);
        System.out.println(player.getFirstName() + " " + player.getLastName()+ ", " + game.getName()+" isimli oyunu kampanya ile aldı. Eski fiyat: "+game.getPrice()+". Kampanyalı fiyat: "+newPrice );
    }
    @Override
    public void add(Player player, Game game) {
        System.out.println(player.getFirstName() + " " + player.getLastName()+ ", " + game.getName()+" isimli oyunu aldı. Fiyat: "+game.getPrice() );
    }

    @Override
    public void update(Player player, Game game) {
        System.out.println(player.getFirstName() + " " + player.getLastName()+ ", " + game.getName()+" isimli oyun güncellendi");
    }

    @Override
    public void delete(Player player, Game game) {
        System.out.println(player.getFirstName() + " " + player.getLastName()+ ", " + game.getName()+" isimli oyun silindi");

    }
}
