package demo.akshay.com.githubdemo

/**
 * Google recommends to keep a single contract interface file for the Model View and Presenter.
 * So MainContract clubs all the interfaces.
 */
interface MainContract {

    interface MainView {

        /**
         * Used for displaying the progressBar
         */
        fun showProgress()

        /**
         * Used for hiding the progressBar
         */
        fun hideProgress()

        /**
         * Used for get next random quote from the GetQuoteInteractorImpl class
         */
        fun setQuote(string: String)
    }

    /**
     * GetQuoteInteractor contains a nested interface onFinishedListener.
     * We’ll be using a handler inside our GetQuoteInteractorImpl.java.
     * On completion of the handler, the onFinished method would be triggered.
     */
    interface GetQuoteInteractor {

        interface OnFinishedListener {
            /**
             * It returns the string which will be displayed in the TextView
             * using the MainView’s instance.
             */

            fun onFinished(string: String)
        }

        fun getNextQuote(listener: OnFinishedListener) {

        }
    }

    interface MainPresenter {

        /**
         * onButtonClick() would be triggered in the MainActivity class when the button is clicked
         */
        fun onButtonClick()

        /**
         * onDestroy() method would be invoked inside the lifecycle method onDestroy() of the MainActivity.
         */
        fun onDestroy()
    }
}