package app.gobakso.com.model.data.api

import app.gobakso.com.App
import app.gobakso.com.IConfig
import app.gobakso.com.model.data.SessionManager
import app.beelabs.com.codebase.base.BaseApi


class Api : BaseApi() {

    companion object {
        private fun initHeader(): Map<String, String> {
            val map = HashMap<String, String>()
            map["Authorization"] = SessionManager.getCredential(App.applicationContext()!!)
//            map["Cache-Control"] = ""
//            map["Content-type"] = ""
            return map
        }

        @Synchronized
        private fun initApiDomain(): ApiService {
            BaseApi.getInstance().apiDomain = IConfig.API_BASE_URL
            return getInstance().setupApi(
                App.getAppComponent(),
                ApiService::class.java,
                true
            ) as ApiService
        }

    }
}