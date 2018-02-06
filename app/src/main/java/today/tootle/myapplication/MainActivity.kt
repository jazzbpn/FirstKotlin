package today.tootle.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


/** TODO Learning */
/** 1. Project Setup */
/** 2. Initialize Github Repository and push project with .gitignore */
/** 3. Kotlin View Binding using kotlin-android-extensions */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myTextView.setText("Set textView using kotlin synthetic view binding")
    }
}
