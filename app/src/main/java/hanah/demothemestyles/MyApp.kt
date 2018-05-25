package hanah.demothemestyles

import android.app.Application

class MyApp : Application() {
    lateinit var appSettings: MyAppSettings

    companion object {
        lateinit var instance: MyApp
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        appSettings = MyAppSettings()
    }

    data class MyAppSettings(var isDarkTheme: Boolean = false)
}