package Concrete;

import Abstract.CampaignService;
import Entity.Campaign;

public class CampaignManager implements CampaignService {
    @Override
    public void add(Campaign campaign) {
        System.out.println("Sisteme yeni kampanya eklendi. Kampanya ismi: "+campaign.getName()+".İndirim oranı: "+campaign.getOran());
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println("Kampanya güncellendi. Kampanya ismi: "+campaign.getName()+". Yeni indirim oranı: "+campaign.getOran());
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println("Kampanya silindi!!!!! Kampanya ismi: "+campaign.getName()+".İndirim oranı: "+campaign.getOran());

    }
}
