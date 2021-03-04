package app.gobakso.com.ui.component

import app.gobakso.com.ui.component.module.EventModule
import app.gobakso.com.ui.component.scope.SupportScope
import com.pede.emoney.ui.component.module.LogicUIModule
import dagger.Subcomponent

@SupportScope
@Subcomponent(modules = [LogicUIModule::class, EventModule::class])
interface SupportSubComponent {

    fun inject(logic: ILogic): ILogic
    fun inject(event: IEvent): IEvent
}