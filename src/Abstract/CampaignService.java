package Abstract;

import Entity.Campaign;
import Entity.Game;
import Entity.Player;

public interface CampaignService {
    void add(Campaign campaign);
    void update(Campaign campaign);
    void delete(Campaign campaign);
}
