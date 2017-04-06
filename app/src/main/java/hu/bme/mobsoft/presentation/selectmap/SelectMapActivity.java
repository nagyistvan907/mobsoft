package hu.bme.mobsoft.presentation.selectmap;

import javax.inject.Inject;

import hu.bme.mobsoft.Mobsoft;
import hu.bme.mobsoft.presentation.base.BaseActivity;

/**
 * Created by Jester on 2017. 04. 06..
 */

public class SelectMapActivity extends BaseActivity implements ISelectMapScreen{

    @Inject
    ISelectMapPresenter selectMapPresenter;

    public SelectMapActivity(){
        Mobsoft.getComponent().inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        selectMapPresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        selectMapPresenter.detachScreen();
        super.onStop();
    }

    @Override
    public void navigateBack() {

    }
}
