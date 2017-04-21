package hu.bme.mobsoft.repository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Jester on 2017. 04. 21..
 */
@Module
public class RepositoryModule {

    @Provides
    @Singleton
    Repository provideRepository(){
        return new SugarOrmRepository();
    }
}
