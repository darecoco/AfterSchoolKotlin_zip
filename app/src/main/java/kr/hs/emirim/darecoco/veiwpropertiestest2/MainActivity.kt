package kr.hs.emirim.darecoco.veiwpropertiestest2

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var t1 : TextView
        var t2 : TextView
        var t3 : TextView

        t1 = findViewById<TextView>(R.id.text1)
        t2 = findViewById(R.id.text2)
        t3 = findViewById<TextView>(R.id.text3)

        t1.setText("Hello Mirim.")
        t1.setTextSize(30.0f)
        t1.setTextColor(Color.MAGENTA)

        t2.setText("Hello Peter.")
        t2.setTextSize(35.0f)
        t2.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD_ITALIC) //와 샌즈!

        t3.setText("Hello World Hello World Hello World Hello World Hello World Hello World Hello World Hello World Hello World Hello World Hello World Hello World Hello World Hello World Hello World Hello World Hello World")
        t3.setSingleLine()
        //setSingleLine은 ...이 아니라 생략되어서 보인다.
    }
}