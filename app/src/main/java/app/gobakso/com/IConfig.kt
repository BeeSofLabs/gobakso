package app.gobakso.com

interface IConfig {
    companion object {

        val API_BASE_URL = "http://"
        val SESSION_TOKEN_CREDENTIAL = ""
        val SESSION_LOGIN_KEY = "session_login"

        object Auth {
            val COMMON_AUTH_LOGIN_USER = "common_auth_login_user"
        }
    }
}
