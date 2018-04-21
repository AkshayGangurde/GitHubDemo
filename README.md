*Android MVP*

With our current approach, the MainActivity class contains all the implementation logic of our application. We’ve been using stuff ranging from Retrofit callbacks to data models(SharedPref, POJO classes) all inside the Activity class.

Eventually, our Activities become god classes and cause problems in maintainability, readability, scalability and refactoring an already bloated code.

Unit testing gets tough since the implementation logic is tightly coupled with the Android APIs. This is where MVP ( Model View Presenter) comes in handy. It allows us to write a clean and flexible code base while giving the luxury to switch any part of the code without much hassle.

![Alt text](https://github.com/AkshayGangurde/GitHubDemo/blob/master/android-mvp-pattern-output.gif "")
