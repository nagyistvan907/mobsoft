package hu.bme.mobsoft.presentation.detail;

import javax.inject.Inject;

import hu.bme.mobsoft.Mobsoft;
import hu.bme.mobsoft.model.Shop;
import hu.bme.mobsoft.presentation.base.BaseActivity;

/**
 * Created by Jester on 2017. 04. 06..
 */

public class DetailActivity extends BaseActivity implements IDetailScreen {


    @Inject
    IDetailPresenter detailPresenter;

    public DetailActivity(){
        Mobsoft.getComponent().inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        detailPresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        detailPresenter.detachScreen();
        super.onStop();
    }

    @Override
    public void navigateBack() {

    }

    @Override
    public void navigateToEdit() {

    }

    @Override
    public void drawShopDetail(Shop shop) {

    }
}
