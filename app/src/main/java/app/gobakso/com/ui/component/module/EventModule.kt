package app.gobakso.com.ui.component.module

import app.gobakso.com.ui.component.manager.EventManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton
import app.gobakso.com.ui.component.IEvent as IEvent1

@Module
class EventModule {

    @Singleton
    @Provides
    fun provideEvent(): IEvent1 {
        return EventManager()
    }


}