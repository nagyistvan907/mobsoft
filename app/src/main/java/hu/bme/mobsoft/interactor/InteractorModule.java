package hu.bme.mobsoft.interactor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import hu.bme.mobsoft.interactor.shop.IShopInteractor;
import hu.bme.mobsoft.interactor.shop.ShopInteractor;

/**
 * Created by Jester on 2017. 04. 21..
 */
@Module
public class InteractorModule {

    @Provides
    @Singleton
    IShopInteractor provideShopInteractor(){
        return new ShopInteractor();
    }

}
