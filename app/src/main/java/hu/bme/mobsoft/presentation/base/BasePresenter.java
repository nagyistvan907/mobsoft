package hu.bme.mobsoft.presentation.base;

/**
 * Created by Jester on 2017. 04. 06..
 */

public class BasePresenter<S extends IBaseScreen> implements IBasePresenter<S> {

    private S screen;

    @Override
    public void attachScreen(S screen) {
        this.screen = screen;
    }

    @Override
    public void detachScreen() {
        screen = null;
    }
}
