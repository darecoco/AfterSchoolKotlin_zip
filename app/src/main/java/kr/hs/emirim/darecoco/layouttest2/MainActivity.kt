package kr.hs.emirim.darecoco.layouttest2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val linear1 = LinearLayout(this)
        linear1.orientation = LinearLayout.VERTICAL
        linear1.setBackgroundColor(Color.rgb(174, 162, 210))
        val params=LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT)
        setContentView(linear1, params)
    }
}