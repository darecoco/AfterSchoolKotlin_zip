package kr.hs.emirim.darecoco.layouttest2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val linear1 = LinearLayout(this)
        linear1.orientation = LinearLayout.VERTICAL
        linear1.setBackgroundColor(Color.rgb(174, 162, 210))
        val params=LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT)
        setContentView(linear1, params)

        var btn = Button(this)
        btn.text="클릭해 보시오"
        btn.setBackgroundColor(Color.rgb(153, 96, 182))
        linear1.addView(btn)

        btn.setOnClickListener{
            Toast.makeText(applicationContext, "클래스에서 생성된 버튼입니다.", Toast.LENGTH_LONG).show()
        }
    }
}