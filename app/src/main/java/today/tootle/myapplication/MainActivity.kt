package today.tootle.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

//  TODO Learning Reference
/** https://medium.com/@ahmedrizwan/android-programming-with-kotlin-6ce3f9b0cbe6 */
/** https://medium.com/@ahmedrizwan/kotlin-retrofit-rxandroid-realm-39d7be5dc9dc  */
/** https://medium.freecodecamp.org/rxandroid-and-kotlin-part-1-f0382dc26ed8 */

/** TODO Implementing on project */
/** 1. Project Setup */
/** 2. Initialize Github Repository and push project with .gitignore */
/** 3. Kotlin View Binding using kotlin-android-extensions */
/** 4. OnClick TextView*/
/** 5. Kotlin EXTENSION to display TOAST */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myTextView.setText("Set textView using kotlin synthetic view binding")

        myTextView.setOnClickListener { view: View? ->

            displayToast("Displaying toast using Kotlin EXTENSIONS ")

        }
    }
}

fun AppCompatActivity.displayToast(message: String) {

    Toast.makeText(this, message, Toast.LENGTH_LONG).show();

}