package kr.hs.emirim.darecoco.ex_autocompletetextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.MultiAutoCompleteTextView
import android.widget.MultiAutoCompleteTextView.Tokenizer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var items = arrayOf("CSI-뉴욕", "CSI-라스베가스", "CSI-마이애미", "Feed", "Feather", "Lost", "Look")

        var autoText = findViewById<AutoCompleteTextView>(R.id.autoText)
        var multiText = findViewById<MultiAutoCompleteTextView>(R.id.multiAutoText)

        var adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, items)
        autoText.setAdapter(adapter)

        var token = MultiAutoCompleteTextView.CommaTokenizer()
        multiText.setTokenizer(token)
        multiText.setAdapter(adapter)
    }
}