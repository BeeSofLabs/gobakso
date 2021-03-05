package app.gobakso.com.ui

import app.beelabs.com.codebase.base.contract.IView
import app.gobakso.com.model.data.api.response.SourceResponse

interface ISplashView : IView {
    fun handleProcessing()
    fun handleDataSource(model: SourceResponse?)
}