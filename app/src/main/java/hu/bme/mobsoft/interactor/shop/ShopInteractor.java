package hu.bme.mobsoft.interactor.shop;

import java.util.List;

import javax.inject.Inject;

import hu.bme.mobsoft.Mobsoft;
import hu.bme.mobsoft.interactor.base.BaseInteractor;
import hu.bme.mobsoft.model.Shop;
import hu.bme.mobsoft.repository.Repository;

/**
 * Created by Jester on 2017. 04. 21..
 */

public class ShopInteractor extends BaseInteractor implements IShopInteractor {


    @Inject
    Repository repository;

    public ShopInteractor(){
        Mobsoft.getComponent().inject(this);
    }

    @Override
    public List<Shop> getShopList() {
        return repository.getShops();
    }

    @Override
    public Shop createShop(Shop shop) {
        long id = repository.createShop(shop);
        shop.setId((int)id);
        return shop;
    }

    @Override
    public Shop modifyShop(Shop shop) {
        if (repository.modifyShop(shop)){
            return shop;
        } else {
            return null;
        }
    }

    @Override
    public boolean deleteShop(Shop shop) {
        return repository.deleteShop(shop);
    }
}
