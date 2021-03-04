package app.gobakso.com

import android.content.Context
import app.gobakso.com.ui.component.*
import app.gobakso.com.ui.component.impl.INavigation
import app.gobakso.com.ui.component.manager.AnimationLogicManager
import app.gobakso.com.ui.component.manager.EventManager
import app.gobakso.com.ui.component.manager.NavigationManager
import app.gobakso.com.ui.component.manager.PaymentLogicManager
import app.gobakso.com.ui.component.module.NavModule
import app.beelabs.com.codebase.base.BaseApp
import app.beelabs.com.codebase.di.component.AppComponent
import app.beelabs.com.codebase.di.component.DaggerAppComponent
import app.gobakso.com.ui.component.IEvent
import app.gobakso.com.ui.component.ILogic
import app.gobakso.com.ui.component.SupportSubComponent
import app.gobakso.com.ui.component.UIComponent

class App : BaseApp() {

    companion object {

        var uiComponent: UIComponent? = null
        var supportSubComponent: SupportSubComponent? = null
        private var instance: App? = null

        fun applicationContext(): Context {
            return instance!!.applicationContext
        }


        fun getAppComponent(): AppComponent? {
            return getComponent()
        }

        fun getNavigationComponent(): INavigation {
            return uiComponent?.inject(NavigationManager())!!
        }

//        fun getHomeNavigationComponent(): IHomeNavigation {
//            return uiComponent?.inject(HomeNavigation())!!
//        }


        // Module LogicUI
        fun getPaymentLogic(): ILogic {
            return supportSubComponent?.inject(PaymentLogicManager())!!
        }

        fun getAnimationLogic(): ILogic {
            return supportSubComponent?.inject(AnimationLogicManager())!!
        }


        // Module Event
        fun getEvent(): IEvent {
            return supportSubComponent?.inject(EventManager())!!
        }

    }

    override fun onCreate() {
        super.onCreate()

        setupBuilder(DaggerAppComponent.builder(), this)
        setupDefaultFont("font/Avenir-Medium.ttf")

        uiComponent = DaggerUIComponent.builder().appComponent(getAppComponent())
            .navModule(NavModule()).build()

        supportSubComponent = DaggerUIComponent.builder().appComponent(getAppComponent()).build()
            .newSupportSubcomponent()

    }

}