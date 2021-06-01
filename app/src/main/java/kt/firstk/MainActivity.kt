package kt.firstk

import android.os.Bundle
import android.view.View
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
    }
    fun buttonOnClick(view: View?) {
        textView!!.text = "Нажата кнопка"
    }
}