package hu.bme.mobsoft.presentation.selectmap;

import hu.bme.mobsoft.presentation.base.IBasePresenter;

/**
 * Created by Jester on 2017. 04. 06..
 */

public interface ISelectMapPresenter extends IBasePresenter<ISelectMapScreen>{

    void longTapMap(String location);

    void clickBack();
}
