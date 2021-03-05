package app.gobakso.com.model.dao

import android.content.Context
import app.beelabs.com.codebase.base.BaseDao
import app.beelabs.com.codebase.base.contract.IDaoPresenter
import app.gobakso.com.model.data.SessionManager

class AuthDao : BaseDao() {
    interface IAuthDao : IDaoPresenter {
        fun getAuthLoginStatus(context: Context): Boolean
    }

    fun getLocalAuthLoginStatus(context: Context): Boolean =
        SessionManager.isLogin(context)
}