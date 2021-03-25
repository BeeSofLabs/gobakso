package app.gobakso.com.ui.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import app.beelabs.com.codebase.base.BaseActivity
import app.gobakso.com.App
import app.gobakso.com.BuildConfig
import app.gobakso.com.IConfig.Companion.DRIVER_MODULE_CLASSNAME
import app.gobakso.com.R
import app.gobakso.com.databinding.ActivityMainBinding
import app.gobakso.com.ui.fragment.home.HomeFragment
import com.google.android.play.core.splitinstall.SplitInstallManager
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory
import com.google.android.play.core.splitinstall.SplitInstallRequest

class MainActivity : BaseActivity() {
    private val moduleDriver by lazy { getString(R.string.driver_feature_module) }
    private lateinit var manager: SplitInstallManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadDriverModule()
    }

    override fun onBackPressed() {
        var fragments = supportFragmentManager.fragments
        for (f in fragments)
            if (f != null && f.childFragmentManager.fragments[0] is HomeFragment) finish()
            else
                App.getNavigationComponent().homeNavigation().navigateToHome(this)
    }

    //    private fun doGeneralAction(): RxTimer? {
//        return object : RxTimer() {
//            override fun onCallback(along: Long?) {
//                val supportAction = App.getAction()
//                supportAction.generalAction(this@MainActivity)
//            }
//        }
//    }
//
//    private fun doSetupAnimation(): RxTimer? {
//        return object : RxTimer() {
//            override fun onCallback(along: Long?) {
//                val supportAnimation = App.getAnimationLogic() as IAnimationLogic
//                supportAnimation.setupAnimation(this@MainActivity)
//            }
//        }
//    }
//
//    private fun doSetupPayment(): RxTimer? {
//        return object : RxTimer() {
//            override fun onCallback(along: Long?) {
//                val supportPayment = App.getPaymentLogic() as IPaymentLogic
//                supportPayment.setupPayment(this@MainActivity)
//            }
//        }
//    }
//
//    private fun doShowLabelManager(): RxTimer? {
//        return object : RxTimer() {
//            override fun onCallback(along: Long?) {
//                App.getAction().showLabelManager(
//                    "Demo Dependency Injection OK!",
//                    labelText,
//                    this@MainActivity
//                )
//            }
//        }
//
//    }

    private fun loadDriverModule() {
        manager = SplitInstallManagerFactory.create(this)
        val request = SplitInstallRequest.newBuilder()
            .addModule(moduleDriver)
            .build()

        // Load and install the requested feature module.
        manager.startInstall(request)

        if (manager.installedModules.contains(moduleDriver)) {
            onSuccessfulLoad(launch = true)
            return
        }
    }

    private fun onSuccessfulLoad(launch: Boolean) {
        if (launch) {
            launchActivity(DRIVER_MODULE_CLASSNAME)
        }
    }

    private fun launchActivity(className: String) {
        intent = Intent()
        intent.setClassName(BuildConfig.APPLICATION_ID, className)
            .also {
                it.putExtra("data", 5000)
                startActivity(it)
            }
    }

//    // trigger reactive programming
//    @SuppressLint("CheckResult")
//        private fun doReactiveAction() {
//            val inputTextObservable = inputTextWatcher()
//            inputTextObservable
//                .observeOn(AndroidSchedulers.mainThread())
//                .doOnNext { showProgressDialog(this, "Loading..l", true) }
//                .observeOn(Schedulers.io())
//                .map { addQuestionMark(it) }
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe {
//                    dismissProgressDialog(this)
//                    showResult(it)
//                    if (it.toLowerCase().contains("done")) {
//                        loadInsuranceModule()
////                    App.getNavigationComponent().homeNavigation(intent).goSecondPage(it, this)
//                    }
//                }
//
//            val buttonObservable = createButtonClickObservable()
//            buttonObservable
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .doOnNext {
//                    dismissProgressDialog(this)
//                    showProgressDialog(this, "Do Reactive...", true)
//                }
//                .observeOn(Schedulers.io())
//                .map { searchEngine(it) }
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe {
//                    dismissProgressDialog(this)
//                    showResult(it)
//                }
//        }
//
//
//        // reactive by clickable listener
//        private fun createButtonClickObservable(): Observable<String> {
//            return Observable.create { emit ->
//                demoButton.setOnClickListener {
//                    emit.onNext("Reactive works")
//                }
//
//                emit.setCancellable {
//                    demoButton.setOnClickListener(null)
//                }
//            }
//        }
//
//        // reactive by textwatcher listener
//        private fun inputTextWatcher(): Observable<String> {
//            return Observable.create { emit ->
//                val tw = object : TextWatcher {
//                    override fun afterTextChanged(s: Editable?) = Unit
//
//                    override fun beforeTextChanged(
//                        s: CharSequence?,
//                        start: Int,
//                        count: Int,
//                        after: Int
//                    ) = Unit
//
//                    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
//                        s?.toString()?.let { emit.onNext(it) }
//                    }
//
//                }
//                inputText.addTextChangedListener(tw)
//                emit.setCancellable { inputText.removeTextChangedListener(tw) }
//            }
//        }
//
//
//        // function bussiness logic
//        private fun addQuestionMark(it: String): String {
//            Log.d("", "timer active")
//            return "$it ?"
//        }
//
//        private fun showResult(it: String) {
//            labelText.text = it
//        }
//
//        private fun searchEngine(it: String): String {
//            Log.d("", "timer active")
//            return it
//        }
//
//
//        private fun fetchDataSource() {
//            ResourcePresenter(this).getSource(
//                "Getting data Source...",
//                RxObserver.DialogTypeEnum.SPINKIT
//            )
//    }
}
