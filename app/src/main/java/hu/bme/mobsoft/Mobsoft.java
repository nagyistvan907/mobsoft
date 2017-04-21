package hu.bme.mobsoft;

import android.app.Application;

import hu.bme.mobsoft.interactor.InteractorModule;
import hu.bme.mobsoft.presentation.PresentationModule;
import hu.bme.mobsoft.repository.RepositoryModule;

/**
 * Created by Jester on 2017. 04. 06..
 */

public class Mobsoft extends Application {

    private static IComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerIComponent.builder().presentationModule(new PresentationModule(this)).interactorModule(new InteractorModule()).repositoryModule(new RepositoryModule()).build();
    }

    public static IComponent getComponent() {
        return component;
    }
}
