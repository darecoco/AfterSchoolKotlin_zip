package kr.hs.emirim.darecoco.direct_7_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.CollapsibleActionView
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.ImageView

lateinit var imgView: ImageView
lateinit var editT: EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imgView = findViewById(R.id.imgview)
        editT = findViewById(R.id.edit_t)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        var mInflater = menuInflater
        mInflater.inflate(R.menu.radiomenu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.rotetion -> {
                imgView.rotation = Float.parseInt(editT.getText().toString())
            }
            R.id.arcticFox -> {
                imgView.setImageDrawable()
            }
        }
        return false
    }
}