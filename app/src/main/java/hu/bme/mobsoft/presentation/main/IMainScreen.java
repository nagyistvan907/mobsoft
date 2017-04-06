package hu.bme.mobsoft.presentation.main;

import java.util.List;

import hu.bme.mobsoft.model.Shop;
import hu.bme.mobsoft.presentation.base.IBaseScreen;

/**
 * Created by Jester on 2017. 04. 06..
 */

public interface IMainScreen extends IBaseScreen {


    void showMap();

    void showList();

    void refreshShops(List<Shop> shops);

    void navigateToEdit();

    void navigateToDetail();

}
