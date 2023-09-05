package kr.hs.emirim.darecoco.dialogmultichoiceitems

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.btn)

        btn.setOnClickListener{
            var foxArray = arrayOf("붉은 여우", "사막 여우", "북극 여우")
            var checkArray = booleanArrayOf(false, true, false)
            var dlg = AlertDialog.Builder(this@MainActivity)
            dlg.setTitle("제일 좋아하는 여우는?")
            dlg.setIcon(R.mipmap.ic_launcher)
            dlg.setMultiChoiceItems(foxArray, checkArray){
                dialog, index, isCheck ->
                if(isCheck) btn.text = foxArray[index]
            }
            dlg.setNegativeButton("닫기", null)
            dlg.show()
        }
    }
}