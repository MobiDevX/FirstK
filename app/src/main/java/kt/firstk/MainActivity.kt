package kt.firstk

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var textView : TextView
    private lateinit var radioGroup: RadioGroup
    private lateinit var rb1 : RadioButton
    private lateinit var rb2 : RadioButton
    private lateinit var rb3 : RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.tv)

        // Добавить радиогруппу с радиокнопками:
        radioGroup = findViewById(R.id.radioGroup)
        rb1 = findViewById(R.id.radioButton1)
        rb2 = findViewById(R.id.radioButton2)
        rb3 = findViewById(R.id.radioButton3)
        rb1.setOnClickListener(rbListener)
        rb2.setOnClickListener(rbListener)
        rb3.setOnClickListener(rbListener)

        // Добавить слушателя:
        val button = findViewById<Button>(R.id.button)
        // 3) Создать слушателя для кнопки:
        val bListener  = View.OnClickListener() {
            textView.text= "bListener: Нажата кнопка"
        }
        button.setOnClickListener(bListener)

        // 2) Добавить слушателя для кнопки:
/*        button.setOnClickListener(View.OnClickListener {
            textView.text= "ClickListener: Нажата кнопка"
        })*/
    }

    // 1) Добавить функцию для обработки нажатия кнопки:
/*    fun buttonClick(view: View) {
        textView.text= "Нажата кнопка"
    }*/

    private val rbListener = View.OnClickListener {
        when (radioGroup.getCheckedRadioButtonId()) {
            R.id.radioButton1 -> textView.text = "Выбрана кнопка 1"
            R.id.radioButton2 -> textView.text = "Выбрана кнопка 2"
            R.id.radioButton3 -> textView.text = "Выбрана кнопка 3"
            else -> textView.text = "Не выбрана кнопка"
        }
    }
}