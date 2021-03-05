package app.gobakso.com.presenter

import android.content.Context
import app.beelabs.com.codebase.base.BasePresenter
import app.beelabs.com.codebase.base.contract.IView
import app.gobakso.com.model.dao.AuthDao

class AuthPresenter(var iView: IView) : BasePresenter(), AuthDao.IAuthDao {

    override fun getAuthLoginStatus(context: Context): Boolean =
        AuthDao().getLocalAuthLoginStatus(context)
}