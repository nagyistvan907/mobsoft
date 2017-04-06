package hu.bme.mobsoft.presentation.edit;

import hu.bme.mobsoft.model.Shop;
import hu.bme.mobsoft.presentation.base.IBaseScreen;

/**
 * Created by Jester on 2017. 04. 06..
 */

public interface IEditScreen extends IBaseScreen {


    void setShop(Shop shop);

    String getShopTitle();

    String getPhoneNumber();

    String getOpeningHours();

    String getWeblink();

    String getComment();

    void navigateBack();

    void navigateSelectMap();



}
