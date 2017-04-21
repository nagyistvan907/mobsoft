package hu.bme.mobsoft.presentation.main;

import javax.inject.Inject;

import hu.bme.mobsoft.Mobsoft;
import hu.bme.mobsoft.interactor.shop.IShopInteractor;
import hu.bme.mobsoft.model.Shop;
import hu.bme.mobsoft.presentation.base.BasePresenter;

/**
 * Created by Jester on 2017. 04. 06..
 */

public class MainPresenter extends BasePresenter<IMainScreen> implements IMainPresenter {

    @Inject
    IShopInteractor shopInteractor;

    public MainPresenter(){
        Mobsoft.getComponent().inject(this);
    }

    @Override
    public void clickShop(Shop shop) {
        if (screen!=null){
            screen.navigateToDetail();
        }
    }

    @Override
    public void clickCreate() {
        if (screen!=null){
            screen.navigateToEdit();
        }
    }

    @Override
    public void refresh() {
        if (screen!=null){
            screen.refreshShops(shopInteractor.getShopList());
        }
    }
}
