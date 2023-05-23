package kr.hs.emirim.darecoco.petphoto

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kr.hs.emirim.darecoco.petphoto.R.id.rg

class MainActivity : AppCompatActivity() {
    lateinit var checkStart : CheckBox
    lateinit var rg : RadioGroup
    lateinit var linear : LinearLayout
    lateinit var btnDone : Button
    lateinit var imgv : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        checkStart = findViewById(R.id.check_start)
        rg = findViewById(R.id.rg)
        linear = findViewById(R.id.linear)
        btnDone = findViewById(R.id.btn_done)
        imgv = findViewById(R.id.imgv)
        linear.visibility = View.INVISIBLE

        checkStart.setOnCheckedChangeListener{compundButton, b ->
            if(checkStart.isChecked){
                linear.visibility = View.VISIBLE
            }else {
                linear.visibility = View.INVISIBLE
            }
        }

        btnDone.setOnClickListener{
            when(rg.checkedRadioButtonId){
                R.id.radio_red -> imgv.setImageResource(R.drawable.red_fox)
                R.id.radio_desert -> imgv.setImageResource(R.drawable.desert_fox)
                R.id.radio_arctic -> imgv.setImageResource(R.drawable.arctic_fox)
                else -> Toast.makeText(applicationContext, "라디오버튼이 선택되지 않았습니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}