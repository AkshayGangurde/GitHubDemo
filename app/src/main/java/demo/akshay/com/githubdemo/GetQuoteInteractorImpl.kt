package demo.akshay.com.githubdemo

import android.os.Handler
import java.util.*

class GetQuoteInteractorImpl : MainContract.GetQuoteInteractor {

    private val arrayList = Arrays.asList(
            "Be yourself. everyone else is already taken.",
            "A room without books is like a body without a soul.",
            "You only live once, but if you do it right, once is enough.",
            "Be the change that you wish to see in the world.",
            "If you tell the truth, you don't have to remember anything."
    )

    override fun getNextQuote(listener: MainContract.GetQuoteInteractor.OnFinishedListener) {
        Handler().postDelayed({ listener.onFinished(getRandomString()) }, 1200)

    }

    private fun getRandomString(): String {
        return arrayList[Random().nextInt(arrayList.size)]
    }
}