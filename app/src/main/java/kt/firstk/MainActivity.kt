package kt.firstk

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView : TextView = findViewById(R.id.tv)

        val x = arrayOf(3, 5, 2)
        //val x = Array(3) {it} // результат: 0, 1, 2,
        x[2] = 7
        x[0] = x[1]+x[2] // результат: 12, 5, 7,


        val b = arrayOfNulls<Int>(3)
        b[2] = 7
        b[0] = (b[1]?: 5) + b[2]!! // результат: 12, null, 7,

        // val list = listOf('D', 'H', 'A')


        // 2) Добавить кнопку, findViewByID и слушателя:
        val button : Button = findViewById(R.id.button)
        button.setOnClickListener(View.OnClickListener {
            var str = " "
            for(i in 0..2) { str += (x[i].toString() + ", ")}
            str += ("\n" + x.size)
            textView.text= str
        })

    }
}