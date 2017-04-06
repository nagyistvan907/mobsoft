package hu.bme.mobsoft.presentation;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import hu.bme.mobsoft.presentation.detail.DetailPresenter;
import hu.bme.mobsoft.presentation.detail.IDetailPresenter;
import hu.bme.mobsoft.presentation.edit.EditPresenter;
import hu.bme.mobsoft.presentation.edit.IEditPresenter;
import hu.bme.mobsoft.presentation.main.IMainPresenter;
import hu.bme.mobsoft.presentation.main.MainPresenter;
import hu.bme.mobsoft.presentation.selectmap.ISelectMapPresenter;
import hu.bme.mobsoft.presentation.selectmap.SelectMapPresenter;

/**
 * Created by Jester on 2017. 04. 06..
 */
@Module
public class PresentationModule {

    private Context context;

    public PresentationModule(Context context){
        this.context = context;
    }

    @Provides
    public Context provideContext(){
        return context;
    }

    @Provides
    @Singleton
    public ISelectMapPresenter provideSelectMapPresenter(){
        return new SelectMapPresenter();
    }

    @Provides
    @Singleton
    public IMainPresenter provideMainPresenter(){
        return new MainPresenter();
    }

    @Provides
    @Singleton
    public IEditPresenter provideEditPresenter(){
        return new EditPresenter();
    }

    @Provides
    @Singleton
    public IDetailPresenter provideDetailPresenter(){
        return new DetailPresenter();
    }

}
