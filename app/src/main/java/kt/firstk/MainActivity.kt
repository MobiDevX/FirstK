package kt.firstk

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var textView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.tv)
        val button = findViewById<Button>(R.id.button)
        // 3) Создать слушателя:
        button.setOnClickListener(bListener)

        // 2) Добавить слушателя для кнопки:
/*        button.setOnClickListener(View.OnClickListener {
            textView.text= "ClickListener: Нажата кнопка"
        })*/
    }
    private val bListener  = View.OnClickListener() {
        textView.text= "bListener: Нажата кнопка"
    }
    // 1) Добавить функцию для обработки нажатия кнопки:
/*    fun buttonClick(view: View) {
        textView.text= "Нажата кнопка"
    }*/
}