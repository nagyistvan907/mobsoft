package hu.bme.mobsoft.presentation.selectmap;

import java.util.Scanner;

import hu.bme.mobsoft.presentation.base.BasePresenter;

/**
 * Created by Jester on 2017. 04. 06..
 */

public class SelectMapPresenter extends BasePresenter<ISelectMapScreen> implements ISelectMapPresenter {


    @Override
    public void longTapMap(String location) {
        if (screen!=null){
            screen.navigateBack();
        }
    }

    @Override
    public void clickBack() {
        if (screen!=null){
            screen.navigateBack();
        }
    }
}
