package demo.akshay.com.githubdemo

import demo.akshay.com.githubdemo.MainContract.MainView


/**
 *  This class implements the Presenter and nested interface from GetQuoteInteractor.
 *  Moreover it instantiates the MainView and GetQuoteInteractor interfaces (View and Model respectively).
 */
class MainPresenterImpl(private var mainView: MainView?, private val getQuoteInteractorImpl: GetQuoteInteractorImpl) : MainContract.MainPresenter, MainContract.GetQuoteInteractor.OnFinishedListener {

    override fun onButtonClick() {
        if (mainView != null) {
            mainView?.showProgress()
        }
        getQuoteInteractorImpl.getNextQuote(this)
    }

    override fun onFinished(string: String) {
        if (mainView != null) {
            mainView?.setQuote(string)
            mainView?.hideProgress()
        }
    }

    override fun onDestroy() {
        mainView = null
    }
}