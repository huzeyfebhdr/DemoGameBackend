package Concrete;

import Abstract.CheckService;
import Abstract.PlayerService;

import Adaptor.CheckManager;
import Entity.Player;

public class PlayerManager implements PlayerService {

    @Override
    public void add(Player player, CheckManager checkManager) {
        if (checkManager.isPersonReal(player)) {
            System.out.println("Oyuncu kaydedildi: " + player.getFirstName() + " " + player.getLastName());
        } else {
            System.out.println("Oyuncu 18 yaşından küçük; kaydedilemez");
        }
    }

    @Override
    public void update(Player player) {
        System.out.println("Oyuncu güncellendi: "+ player.getFirstName() + " " + player.getLastName());
    }

    @Override
    public void delete(Player player) {
        System.out.println("Oyuncu silindi: "+ player.getFirstName() + " " + player.getLastName());
    }
}
