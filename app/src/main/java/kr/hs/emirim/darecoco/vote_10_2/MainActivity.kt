package kr.hs.emirim.darecoco.vote_10_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "밴드 선호도 투표"

        var voteCount = IntArray(9)
        //int[] voteCount = new int[9] 코드가 위 코드와 같다. 하지만 이것은 java의 문법.

        for(i in 0..8)
            voteCount[i] = 0

        var imgV = arrayOfNulls<ImageView>(9)
        var imgVId = arrayOf(R.id.img1, R.id.img2, R.id.img3,
                                            R.id.img4, R.id.img5, R.id.img6,
                                            R.id.img7, R.id.img8, R.id.img9)
        var imgName = arrayOf("And One", "무키무키만만수", "Beatles",
                                            "Oasis", "Blur", "Poketmon band",
                                            "P-Model", "Doctors","My Chemical Romance")

        for(i in imgVId.indices){
            imgV[i] = findViewById(imgVId[i])
            imgV[i]!!.setOnClickListener{ //null값과 상관없이 무조건 진행시켜!!
                voteCount[i]++
                Toast.makeText(applicationContext, imgName[i]+": "+voteCount[i]+"표", Toast.LENGTH_SHORT).show()
            }
        }

        var btnResult = findViewById<Button>(R.id.result)
        btnResult.setOnClickListener{
            var intent = Intent(applicationContext, ReasultActivity::class.java)
            intent.putExtra("voteCount", voteCount)
            intent.putExtra("imgName", imgName)
            startActivity(intent)
        }
    }
}