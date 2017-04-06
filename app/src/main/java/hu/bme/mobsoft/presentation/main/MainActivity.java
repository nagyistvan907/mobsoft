package hu.bme.mobsoft.presentation.main;

import java.util.List;

import javax.inject.Inject;

import hu.bme.mobsoft.Mobsoft;
import hu.bme.mobsoft.model.Shop;
import hu.bme.mobsoft.presentation.base.BaseActivity;

/**
 * Created by Jester on 2017. 04. 06..
 */

public class MainActivity extends BaseActivity implements IMainScreen {

    @Inject
    IMainPresenter mainPresenter;

    public MainActivity(){
        Mobsoft.getComponent().inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mainPresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        mainPresenter.detachScreen();
        super.onStop();
    }

    @Override
    public void showMap() {

    }

    @Override
    public void showList() {

    }

    @Override
    public void refreshShops(List<Shop> shops) {

    }

    @Override
    public void navigateToEdit() {

    }

    @Override
    public void navigateToDetail() {

    }
}
