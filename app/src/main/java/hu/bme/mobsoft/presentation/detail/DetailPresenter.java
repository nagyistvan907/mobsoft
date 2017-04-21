package hu.bme.mobsoft.presentation.detail;

import hu.bme.mobsoft.presentation.base.BasePresenter;

/**
 * Created by Jester on 2017. 04. 06..
 */

public class DetailPresenter extends BasePresenter<IDetailScreen> implements IDetailPresenter {

    @Override
    public void clickEdit() {
        if (screen!=null){
            screen.navigateToEdit();
        }
    }

    @Override
    public void clicksBack() {
        if (screen!=null){
            screen.navigateBack();
        }
    }
}
