package kt.firstk

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var tv : TextView
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv = findViewById(R.id.textView)
        // 2) Добавить кнопку, findViewByID и слушателя:
        button = findViewById(R.id.button)
        button.setOnClickListener(View.OnClickListener { tv.setText("Нажата кнопка Ok") })
    }
}