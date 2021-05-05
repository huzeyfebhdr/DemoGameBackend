package Adaptor;

import Abstract.CheckService;
import Entity.Player;

public class CheckManager implements CheckService {
    //mernisden aldım varsayıyorum ide'den dolayı sıkıntı yaşıyorum

    @Override
    public boolean isPersonReal(Player player) {
        return player.getBirthYear() >= 18;
    }
}
