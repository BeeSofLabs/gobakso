package app.gobakso.com.ui.di

import app.beelabs.com.codebase.di.component.AppComponent
import app.gobakso.com.ui.di.impl.IHomeNavigation
import app.gobakso.com.ui.di.impl.INavigation
import app.gobakso.com.ui.di.module.NavModule
import com.pede.emoney.ui.component.scope.UIScope
import dagger.Component

@UIScope
@Component(modules = [NavModule::class], dependencies = [AppComponent::class])
interface UIComponent {
    fun inject(iNavigation: INavigation): INavigation
    fun inject(iHomeNavigation: IHomeNavigation): IHomeNavigation

    fun newSupportSubcomponent() : SupportSubComponent
}

