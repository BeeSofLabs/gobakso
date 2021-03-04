package com.pede.emoney.ui.component.module

import app.gobakso.com.ui.component.impl.IAnimationLogic
import app.gobakso.com.ui.component.impl.IPaymentLogic
import app.gobakso.com.ui.component.manager.AnimationLogicManager
import app.gobakso.com.ui.component.manager.PaymentLogicManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LogicUIModule {

    @Singleton
    @Provides
    fun providePaymentLogic(): IPaymentLogic {
        return PaymentLogicManager()
    }

    @Singleton
    @Provides
    fun provideAnimationLogic(): IAnimationLogic {
        return AnimationLogicManager()
    }
}