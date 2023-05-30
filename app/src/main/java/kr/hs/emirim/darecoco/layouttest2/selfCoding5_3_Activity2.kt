package kr.hs.emirim.darecoco.layouttest2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class selfCoding5_3_Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val main_linear = LinearLayout(this)
        main_linear.orientation = LinearLayout.VERTICAL
        val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT)
        setContentView(main_linear, params)

        val edit_text = EditText(this)
        main_linear.addView(edit_text)

        val btn = Button(this)
        btn.text="버튼입니다. ㅖ."
        btn.setBackgroundColor(Color.YELLOW)
        main_linear.addView(btn)

        val text_view = TextView(this)
        text_view.setTextColor(Color.rgb(241, 146, 146))
        main_linear.addView(text_view)

        btn.setOnClickListener {
            text_view.setText(edit_text.text)
        }
    }
}