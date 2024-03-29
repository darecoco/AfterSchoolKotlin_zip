package kr.hs.emirim.darecoco.dialogtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var btnItem:Button
    lateinit var textResult:TextView
    lateinit var image:ImageView
    var versionArray = arrayOf("ib", "매드파터","마녀의 집", "아오오니")
    var horrorImageArray = arrayOf(R.drawable.ib, R.drawable.madfather, R.drawable.witchshouse, R.drawable.aooni)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnItem = findViewById(R.id.btn_item)
        textResult = findViewById(R.id.text_result)
        image = findViewById(R.id.image_v)

        btnItem.setOnClickListener{
            var dlg = AlertDialog.Builder(this@MainActivity)
            dlg.setTitle("최고의 쯔꾸르 공포게임은?")
            dlg.setIcon(R.drawable.scary)
            dlg.setItems(versionArray){ dialog, index ->
                textResult.text = versionArray[index]
//                when(index){
//                    0 ->
//                        image.setImageResource(R.drawable.ib)
//                    1->
//                        image.setImageResource(R.drawable.madfather)
//                    2->
//                        image.setImageResource(R.drawable.witchshouse)
//                    3->
//                        image.setImageResource(R.drawable.aooni)
//                }
                image.setImageResource(horrorImageArray[index])
            }

            dlg.setNegativeButton("닫기", null)
            dlg.show()
        }

    }
}