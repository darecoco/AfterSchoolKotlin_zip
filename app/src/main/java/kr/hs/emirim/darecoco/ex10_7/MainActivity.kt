package kr.hs.emirim.darecoco.ex10_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar

class MainActivity : AppCompatActivity() {
    lateinit var rbar1: RatingBar
    lateinit var rbar2: RatingBar
    lateinit var rbar3: RatingBar
    lateinit var btnInc : Button
    lateinit var btnDec : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rbar1 = findViewById(R.id.rbar1)
        rbar2 = findViewById(R.id.rbar2)
        rbar3 = findViewById(R.id.rbar3)
        btnInc = findViewById(R.id.btnInc)
        btnDec = findViewById(R.id.btnDec)

        btnInc.setOnClickListener {
            rbar1.rating = rbar1.rating + rbar1.stepSize
            rbar2.rating = rbar2.rating + rbar2.stepSize
            rbar3.rating = rbar3.rating + rbar3.stepSize
        }

        btnDec.setOnClickListener {
            rbar1.rating = rbar1.rating - rbar1.stepSize
            rbar2.rating = rbar2.rating - rbar2.stepSize
            rbar3.rating = rbar3.rating - rbar3.stepSize
        }
    }
}