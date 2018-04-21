package demo.akshay.com.githubdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

/**
 *  Our MainActivity will implement the  MainView interface to handle the user interaction
 */
class MainActivity : AppCompatActivity(), MainContract.MainView {

    private lateinit var mainPresenter: MainContract.MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainPresenter = MainPresenterImpl(this, GetQuoteInteractorImpl())

        buttonGetQuote.setOnClickListener {
            mainPresenter.onButtonClick()
        }
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onDestroy() {
        super.onDestroy()
        mainPresenter.onDestroy()
    }

    override fun showProgress() {
        progressBarQuote.visibility = View.VISIBLE
        textViewQuote.visibility = View.INVISIBLE
    }

    override fun setQuote(string: String) {
        textViewQuote.text = string
    }

    override fun hideProgress() {
        progressBarQuote.visibility = View.GONE
        textViewQuote.visibility = View.VISIBLE
    }

}
