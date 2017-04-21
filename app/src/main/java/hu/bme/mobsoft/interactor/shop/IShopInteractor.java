package hu.bme.mobsoft.interactor.shop;

import java.util.List;

import hu.bme.mobsoft.model.Shop;

/**
 * Created by Jester on 2017. 04. 21..
 */

public interface IShopInteractor {

    List<Shop> getShopList();

    Shop createShop(Shop shop);

    Shop modifyShop(Shop shop);

    boolean deleteShop(Shop shop);

}
