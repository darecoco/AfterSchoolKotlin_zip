package kr.hs.emirim.darecoco.tablelayouttest1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit internal var edit1 : EditText
    lateinit internal var edit2 : EditText
    lateinit internal var btnPlus : Button
    lateinit internal var btnMinus : Button
    lateinit internal var btnMultiply : Button
    lateinit internal var btnDivide : Button
    lateinit internal var textReasult : TextView
    lateinit internal var num1 : String
    lateinit internal var num2 : String
    var result : Int? = null
    var btns = ArrayList<Button>(10)
    var btnIds = arrayOf(R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ex5_2)
        edit1 = findViewById(R.id.edit1)
        edit2 = findViewById(R.id.edit2)
        btnPlus = findViewById(R.id.btnPlus)
        btnMinus = findViewById(R.id.btnMinus)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnDivide = findViewById(R.id.btnDivide)
        textReasult = findViewById(R.id.textResult)
    }
}