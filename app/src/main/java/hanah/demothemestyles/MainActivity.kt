package hanah.demothemestyles

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(if (MyApp.instance.appSettings.isDarkTheme) R.style.AppTheme_Dark else R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        switch1?.isChecked = MyApp.instance.appSettings.isDarkTheme
        switch1?.setOnCheckedChangeListener { buttonView, isChecked ->
            MyApp.instance.appSettings.isDarkTheme = isChecked
            this@MainActivity.recreate()
        }
    }
}
