package hu.bme.mobsoft;

import javax.inject.Singleton;

import dagger.Component;
import hu.bme.mobsoft.interactor.InteractorModule;
import hu.bme.mobsoft.presentation.PresentationModule;
import hu.bme.mobsoft.presentation.detail.DetailActivity;
import hu.bme.mobsoft.presentation.edit.EditActivity;
import hu.bme.mobsoft.presentation.main.MainActivity;
import hu.bme.mobsoft.presentation.selectmap.SelectMapActivity;
import hu.bme.mobsoft.repository.RepositoryModule;

/**
 * Created by Jester on 2017. 04. 06..
 */
@Singleton
@Component(modules={PresentationModule.class, InteractorModule.class, RepositoryModule.class})
public interface IComponent {

    void inject(SelectMapActivity selectMapActivity);
    void inject(MainActivity mainActivity);
    void inject(EditActivity editActivity);
    void inject(DetailActivity detailActivity);

}
