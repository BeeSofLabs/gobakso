package app.gobakso.com.ui

import app.beelabs.com.codebase.base.contract.IView
import app.gobakso.com.model.api.response.SourceResponse

interface IMainView : IView {
    fun handleProcessing()
    fun handleDataSource(model: SourceResponse?)
}