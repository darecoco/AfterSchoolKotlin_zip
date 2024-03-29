package kr.hs.emirim.darecoco.layouttest2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class selfCoding5_3_Activity2 : AppCompatActivity() {
    lateinit var edit : EditText
    lateinit var text:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val main_linear = LinearLayout(this)
        main_linear.orientation = LinearLayout.VERTICAL
        val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT)
        setContentView(main_linear, params)

        edit = EditText(this)
        edit.hint = "아무거나 쳐보세용"
        main_linear.addView(edit)

        val btn = Button(this)
        btn.text="버튼입니다. ㅖ."
        btn.setBackgroundColor(Color.YELLOW)
        main_linear.addView(btn)

        text = TextView(this)
        text.setTextColor(Color.rgb(241, 146, 146))
        main_linear.addView(text)

        btn.setOnClickListener {
            text.text = edit.text
        }
    }
}