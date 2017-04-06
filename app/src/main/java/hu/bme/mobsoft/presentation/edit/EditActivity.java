package hu.bme.mobsoft.presentation.edit;

import javax.inject.Inject;

import hu.bme.mobsoft.Mobsoft;
import hu.bme.mobsoft.model.Shop;
import hu.bme.mobsoft.presentation.base.BaseActivity;

/**
 * Created by Jester on 2017. 04. 06..
 */

public class EditActivity extends BaseActivity implements IEditScreen {

    @Inject
    IEditPresenter editPresenter;

    public EditActivity(){
        Mobsoft.getComponent().inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        editPresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        editPresenter.detachScreen();
        super.onStop();
    }

    @Override
    public void setShop(Shop shop) {

    }

    @Override
    public String getShopTitle() {
        return null;
    }


    @Override
    public String getPhoneNumber() {
        return null;
    }

    @Override
    public String getOpeningHours() {
        return null;
    }

    @Override
    public String getWeblink() {
        return null;
    }

    @Override
    public String getComment() {
        return null;
    }

    @Override
    public void navigateBack() {

    }

    @Override
    public void navigateSelectMap() {

    }
}
