package app.gobakso.com.ui.di.module

import app.gobakso.com.ui.di.impl.INavigation
import app.gobakso.com.ui.di.manager.NavigationManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class NavModule {

    @Singleton
    @Provides
    fun provideNavigation(): INavigation {
        return NavigationManager()
    }


}