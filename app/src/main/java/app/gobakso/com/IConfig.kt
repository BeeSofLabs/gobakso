package app.gobakso.com

interface IConfig {
    companion object {

        val API_BASE_URL = "http://"
        val SESSION_TOKEN_CREDENTIAL = ""
        val SESSION_LOGIN_KEY = "session_login"
        val SEARCH_BOUNDS_RIGHT_OFFSET = 50
        private const val PACKAGE_DRIVER_FEATURE = "app.gobakso.com.driver.ui.activity"
        const val DRIVER_MODULE_CLASSNAME = "$PACKAGE_DRIVER_FEATURE.DriverHomeActivity"

        object Auth {
            val COMMON_AUTH_LOGIN_USER = "common_auth_login_user"
        }
    }
}
