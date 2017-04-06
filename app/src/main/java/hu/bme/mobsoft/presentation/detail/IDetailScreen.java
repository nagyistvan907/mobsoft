package hu.bme.mobsoft.presentation.detail;

import hu.bme.mobsoft.model.Shop;
import hu.bme.mobsoft.presentation.base.IBaseScreen;

/**
 * Created by Jester on 2017. 04. 06..
 */

public interface IDetailScreen extends IBaseScreen{

    void navigateBack();

    void navigateToEdit();

    void drawShopDetail(Shop shop);

}
