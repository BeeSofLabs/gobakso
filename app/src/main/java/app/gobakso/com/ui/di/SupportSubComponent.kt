package app.gobakso.com.ui.di

import app.gobakso.com.ui.di.module.EventModule
import app.gobakso.com.ui.di.scope.SupportScope
import com.pede.emoney.ui.component.module.LogicUIModule
import dagger.Subcomponent

@SupportScope
@Subcomponent(modules = [LogicUIModule::class, EventModule::class])
interface SupportSubComponent {

    fun inject(logic: ILogic): ILogic
    fun inject(event: IEvent): IEvent
}