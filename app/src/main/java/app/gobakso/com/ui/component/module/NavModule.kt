package app.gobakso.com.ui.component.module

import app.gobakso.com.ui.component.impl.INavigation
import app.gobakso.com.ui.component.manager.NavigationManager
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