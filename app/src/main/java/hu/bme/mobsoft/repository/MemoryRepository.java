package hu.bme.mobsoft.repository;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import hu.bme.mobsoft.model.Shop;

/**
 * Created by Jester on 2017. 04. 21..
 */

public class MemoryRepository implements Repository {

    List<Shop> shopList = new ArrayList<>();
    int id = 1;

    @Override
    public void open(Context context) {
        Shop shop = new Shop();
        shop.setId(id++);
        shop.setComment("comment 1");
        shop.setLocation("49.21312 10.32313");
        shop.setOpeningHours("8:00 - 17:00");
        shop.setPhoneNumber("+36 42 3213 321");
        shop.setTitle("Title 1");
        shop.setWeblink("www.google.hu");
        shopList.add(shop);
        shop = new Shop();
        shop.setId(id++);
        shop.setComment("comment 2");
        shop.setLocation("42.21312 13.32313");
        shop.setOpeningHours("6:00 - 20:00");
        shop.setPhoneNumber("+363 3232 321");
        shop.setTitle("Title 2");
        shop.setWeblink("www.google.com");
        shopList.add(shop);
    }

    @Override
    public void close() {

    }

    @Override
    public List<Shop> getShops() {
        return shopList;
    }

    @Override
    public long createShop(Shop shop) {
        shop.setId(id++);
        shopList.add(shop);
        return shop.getId();
    }

    @Override
    public boolean modifyShop(Shop shop) {
        for (Shop shop1 : shopList){
            if (shop1.getId()==shop.getId()){
                shop1.setWeblink(shop.getWeblink());
                shop1.setTitle(shop.getTitle());
                shop1.setPhoneNumber(shop.getPhoneNumber());
                shop1.setOpeningHours(shop.getOpeningHours());
                shop1.setLocation(shop.getLocation());
                shop1.setComment(shop.getComment());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteShop(Shop shop) {
        return false;
    }

    @Override
    public boolean isInDB(Shop shop) {
        int shopid = -1;
        for (int i=shopList.size()-1;i>=0;i++){
            if (shopList.get(i).getId()==shop.getId()){
                shopList.remove(i);
                return true;
            }
        }
        return false;
    }
}
