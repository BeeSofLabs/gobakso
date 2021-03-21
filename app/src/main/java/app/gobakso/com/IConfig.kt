package app.gobakso.com

interface IConfig {
    companion object {

        val API_BASE_URL = "http://"
        val SESSION_TOKEN_CREDENTIAL = ""
        val SESSION_LOGIN_KEY = "session_login"
        val SEARCH_BOUNDS_RIGHT_OFFSET = 50

        object Auth {
            val COMMON_AUTH_LOGIN_USER = "common_auth_login_user"
        }
    }
}
