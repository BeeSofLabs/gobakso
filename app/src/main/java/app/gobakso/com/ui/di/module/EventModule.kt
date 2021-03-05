package app.gobakso.com.ui.di.module

import app.gobakso.com.ui.di.manager.EventManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton
import app.gobakso.com.ui.di.IEvent as IEvent1

@Module
class EventModule {

    @Singleton
    @Provides
    fun provideEvent(): IEvent1 {
        return EventManager()
    }


}