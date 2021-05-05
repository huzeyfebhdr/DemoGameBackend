import Adaptor.CheckManager;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Entity.Campaign;
import Entity.Game;
import Entity.Player;
import Concrete.PlayerManager;

public class Main {
    public static void main(String[] args) {

        Player gamer1 = new Player(1,"Huzeyfe","Solak",1993);
        Player gamer2 = new Player(2,"Osman","Sungur",1995);
        Player gamer3 = new Player(3,"Emre","Sahin",1991);

        PlayerManager playerManager1=new PlayerManager();
        CheckManager checkManager =new CheckManager();
        playerManager1.add(gamer1,checkManager);
        playerManager1.add(gamer2,checkManager);
        playerManager1.update(gamer2);

        System.out.println(" ");

        Game game1 = new Game(1, "Football Manager 2021", 149);
        Game game2 = new Game(2, "Star Wars", 249);
        Game game3 = new Game(3, "PUBG", 101);
        Game game4 = new Game(4, "PES 2021", 85);
        Game game5 = new Game(5, "Formula 1", 190);

        Campaign campaign1 = new Campaign(1, "Black Friday", 20);
        Campaign campaign2 = new Campaign(2, "Yılbaşı", 15);
        Campaign campaign3 = new Campaign(3, "23 Nisan", 10);

        GameManager gameManager=new GameManager();
        gameManager.add(gamer1,game5); System.out.println("");
        gameManager.add(gamer2,game3); System.out.println("");
        gameManager.add(gamer3,game1,campaign1);

        System.out.println("");

        CampaignManager campaignManager = new CampaignManager();
        campaignManager.add(campaign3);
        campaignManager.update(campaign2);
        campaignManager.delete(campaign3);







        System.out.println("");




    }
}
