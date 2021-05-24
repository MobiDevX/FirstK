package kt.firstk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var editText : EditText
    lateinit var textView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)
        textView = findViewById(R.id.textView)
        val year = editText.text.toString().toInt()
            textView.text = when (year) {
                2012 -> "Jellybean"
                2007,2008 -> "До Андроидная эра"
                in 2015..2019 -> " от Lollipop до Pie "
            else -> " другие версии "
        }
    }
}