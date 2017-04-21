package hu.bme.mobsoft.repository;

import android.content.Context;

import java.util.List;

import hu.bme.mobsoft.model.Shop;

/**
 * Created by Jester on 2017. 04. 21..
 */

public interface Repository {

    void open(Context context);

    void close();

    List<Shop> getShops();

    long createShop(Shop shop);

    boolean modifyShop(Shop shop);

    boolean deleteShop(Shop shop);

    boolean isInDB(Shop shop);
}
