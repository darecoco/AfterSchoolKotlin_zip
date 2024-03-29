package kr.hs.emirim.darecoco.petphoto

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.*
import kr.hs.emirim.darecoco.petphoto.R.id.rg

class MainActivity : AppCompatActivity() {
    lateinit var checkStart : Switch
    lateinit var rg : RadioGroup
    lateinit var linear : LinearLayout
    lateinit var imgv : ImageView
    lateinit var btnFinish:Button
    lateinit var btnFirst:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        checkStart = findViewById(R.id.check_start)
        rg = findViewById(R.id.rg)
        linear = findViewById(R.id.linear)
        imgv = findViewById(R.id.imgv)
        btnFinish = findViewById(R.id.btn_finish)
        btnFirst = findViewById(R.id.btn_first)
        linear.visibility = View.INVISIBLE

        checkStart.setOnCheckedChangeListener{compundButton, b ->
            if(checkStart.isChecked){
                linear.visibility = View.VISIBLE
            }else {
                linear.visibility = View.INVISIBLE
            }
        }

        rg.setOnCheckedChangeListener{ compundButton, b->
            when(rg.checkedRadioButtonId){
                R.id.radio_red -> imgv.setImageResource(R.drawable.red_fox)
                R.id.radio_desert -> imgv.setImageResource(R.drawable.desert_fox)
                R.id.radio_arctic -> imgv.setImageResource(R.drawable.arctic_fox)
            }
        }

        btnFinish.setOnClickListener(btnListener)
        btnFirst.setOnClickListener(btnListener)

    }
    var btnListener = OnClickListener{
        when(it.id){
            R.id.btn_finish -> finish()
            R.id.btn_first -> linear.visibility = View.INVISIBLE
        }
    }
}