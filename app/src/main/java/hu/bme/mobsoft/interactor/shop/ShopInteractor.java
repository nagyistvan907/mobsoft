package hu.bme.mobsoft.interactor.shop;

import java.util.List;

import hu.bme.mobsoft.interactor.base.BaseInteractor;
import hu.bme.mobsoft.model.Shop;

/**
 * Created by Jester on 2017. 04. 21..
 */

public class ShopInteractor extends BaseInteractor implements IShopInteractor {


    @Override
    public List<Shop> getShopList() {
        return null;
    }

    @Override
    public Shop createShop(Shop shop) {
        return null;
    }

    @Override
    public Shop modifyShop(Shop shop) {
        return null;
    }

    @Override
    public boolean deleteShop(int shopId) {
        return false;
    }
}
