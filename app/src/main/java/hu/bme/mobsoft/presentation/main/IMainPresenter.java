package hu.bme.mobsoft.presentation.main;

import hu.bme.mobsoft.model.Shop;
import hu.bme.mobsoft.presentation.base.IBasePresenter;

/**
 * Created by Jester on 2017. 04. 06..
 */

public interface IMainPresenter extends IBasePresenter<IMainScreen>{

    void clickShop(Shop shop);

    void clickCreate();

    void refresh();


}
