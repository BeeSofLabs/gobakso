package app.gobakso.com.ui.activity

import android.os.Bundle
import app.beelabs.com.codebase.base.BaseActivity
import app.gobakso.com.R
import app.gobakso.com.databinding.ActivityMainBinding
import com.google.android.play.core.splitinstall.SplitInstallManager

class MainActivity : BaseActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)

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

//    private fun loadInsuranceModule() {
//        val request = SplitInstallRequest.newBuilder()
//            .addModule(moduleInsurance)
//            .build()
//
//        // Load and install the requested feature module.
//        manager.startInstall(request)
//
//        if (manager.installedModules.contains(moduleInsurance)) {
//            onSuccessfulLoad(launch = true)
//            return
//        }
//    }
//
//    private fun onSuccessfulLoad(launch: Boolean) {
//        if (launch) {
//            launchActivity(MODULE_INSURANCE_CLASSNAME)
//        }
//    }
//
//    private fun launchActivity(className: String) {
//        intent = Intent()
//        intent.setClassName(BuildConfig.APPLICATION_ID, className)
//            .also {
//                it.putExtra("data", 5000)
//                startActivity(it)
//            }
//    }
//
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
