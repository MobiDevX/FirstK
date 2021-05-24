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
        val year = editText.text.toString()
            textView.text = when (year) {
                "2010" -> "Froyo"
                "2012" -> "Jellybean"
            else -> " другие версии "
        }
    }
}