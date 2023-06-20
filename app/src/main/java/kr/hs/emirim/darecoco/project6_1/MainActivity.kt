package kr.hs.emirim.darecoco.project6_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CalendarView
import android.widget.Chronometer
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.TimePicker

class MainActivity : AppCompatActivity() {
    lateinit var chrono1 : Chronometer
    lateinit var btnStart : Button
    lateinit var rg : RadioGroup
    lateinit var btnEnd : Button
    lateinit var textview : TextView
    lateinit var calendar: CalendarView
    lateinit var timepicker : TimePicker
    var selectedYear : Int = 0
    var selectedMonth : Int = 0
    var selectedDay : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chrono1 = findViewById(R.id.chrono1)
        btnStart = findViewById(R.id.btnstart)
        btnEnd = findViewById(R.id.btn_end)
        rg=findViewById(R.id.rg)
        calendar = findViewById(R.id.calen)
        timepicker = findViewById(R.id.timepicker)
        textview = findViewById(R.id.textview)

        timepicker.visibility = View.INVISIBLE
        calendar.visibility = View.VISIBLE
    }
}