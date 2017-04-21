package hu.bme.mobsoft.presentation.edit;

import javax.inject.Inject;

import hu.bme.mobsoft.Mobsoft;
import hu.bme.mobsoft.interactor.shop.IShopInteractor;
import hu.bme.mobsoft.model.Shop;
import hu.bme.mobsoft.presentation.base.BasePresenter;

/**
 * Created by Jester on 2017. 04. 06..
 */

public class EditPresenter extends BasePresenter<IEditScreen> implements IEditPresenter  {

    @Inject
    IShopInteractor shopInteractor;

    public EditPresenter(){
        Mobsoft.getComponent().inject(this);
    }

    @Override
    public void setShop(Shop shop) {
        this.shop = shop;
    }

    Shop shop;

    @Override
    public void clickSelectMap() {
        if (screen!=null){
            screen.navigateSelectMap();
        }
    }

    @Override
    public void clickModify() {
        if (screen!=null){
            if (shop!=null){
                shop.setTitle(screen.getShopTitle());
                shop.setComment(screen.getComment());
                shop.setOpeningHours(screen.getOpeningHours());
                shop.setPhoneNumber(screen.getPhoneNumber());
                shopInteractor.modifyShop(shop);
            } else {
                shop = new Shop();
                shop.setTitle(screen.getShopTitle());
                shop.setComment(screen.getComment());
                shop.setOpeningHours(screen.getOpeningHours());
                shop.setPhoneNumber(screen.getPhoneNumber());
                shopInteractor.createShop(shop);
            }

        }
    }

    @Override
    public void clickBack() {
        if (screen!=null){
            screen.navigateBack();
        }
    }
}
