package kr.hs.emirim.darecoco.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var edit1 : EditText;
    lateinit var edit2 : EditText;
    lateinit var btnAdd : Button;
    lateinit var btnMinus :Button;
    lateinit var btnMultipy : Button;
    lateinit var btnDivide : Button;
    lateinit var num1 : String;
    lateinit var num2 : String;
    lateinit var textResult: TextView;
    lateinit var btnMod:Button;
    var result: Double? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edit1 = findViewById(R.id.edit1)
        edit2 = findViewById(R.id.edit2)
        textResult = findViewById(R.id.text_result)
        btnAdd = findViewById(R.id.btn_plus)
        btnMinus = findViewById(R.id.btn_minus)
        btnMultipy = findViewById(R.id.btn_multiply)
        btnDivide = findViewById(R.id.btn_divide)
        btnMod = findViewById(R.id.btn_mod)

        btnAdd.setOnClickListener(btnListener)
        btnMinus.setOnClickListener(btnListener)
        btnMultipy.setOnClickListener(btnListener)
        btnDivide.setOnClickListener(btnListener)
    }

    var btnListener = OnClickListener{
        num1 = edit1.text.toString()
        num2 = edit2.text.toString()
        if(num1=="" || num2==""){
            Toast.makeText(baseContext, "숫자를 입력하지 않고 버튼을 누르면 안됨!", Toast.LENGTH_SHORT).show()
            return@OnClickListener
        }
        when(it.id){
            R.id.btn_plus -> result = num1.toDouble() + num2.toDouble()
            R.id.btn_minus -> result = num1.toDouble() - num2.toDouble()
            R.id.btn_multiply -> result = num1.toDouble() * num2.toDouble()
            R.id.btn_divide -> {
                if(num2 == "0"){
                    Toast.makeText(baseContext, "0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show()
                    return@OnClickListener
                }
                result = num1.toDouble() / num2.toDouble()
            }
        }
        textResult.text = "계산 결과 : " + result
    }
}