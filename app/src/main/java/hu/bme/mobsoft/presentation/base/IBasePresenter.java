package hu.bme.mobsoft.presentation.base;

/**
 * Created by Jester on 2017. 04. 06..
 */

public interface IBasePresenter<S> {

    void attachScreen(S screen);

    void detachScreen();

}
