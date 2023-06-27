package kr.hs.emirim.darecoco.project6_1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import android.widget.Button
import android.widget.CalendarView
import android.widget.Chronometer
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.TimePicker

class MainActivity : AppCompatActivity() {
    lateinit var chrono1 : Chronometer
    lateinit var btnStart : Button
    lateinit var rg : RadioGroup
    lateinit var radioCal : RadioButton
    lateinit var radioTime : RadioButton
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
        radioCal = findViewById(R.id.radioData)
        radioTime = findViewById(R.id.radioTime)
        calendar = findViewById(R.id.calen)
        timepicker = findViewById(R.id.timepicker)
        textview = findViewById(R.id.textview)

        timepicker.visibility = View.INVISIBLE
        calendar.visibility = View.VISIBLE

        radioCal.setOnClickListener{
            timepicker.visibility = View.INVISIBLE
            calendar.visibility = View.VISIBLE
        }
        radioTime.setOnClickListener{
            timepicker.visibility = View.VISIBLE
            calendar.visibility = View.INVISIBLE
        }

        btnStart.setOnClickListener{
            chrono1.base = SystemClock.elapsedRealtime()
            chrono1.start()
            chrono1.setTextColor(Color.RED)

        }

        btnEnd.setOnClickListener{
            chrono1.stop()
            chrono1.setTextColor(Color.BLUE)
            textview.setText("" + selectedYear + "년 " + selectedMonth + "월 " + selectedDay + "일 ")
            textview.append("" + timepicker.currentHour + "시 " + timepicker.currentMinute + "분 ")
            textview.append("예약됨")
        }

        calendar.setOnDateChangeListener{ calendarVeiw, year, month, day ->
            selectedYear = year
            selectedMonth = month + 1
            selectedDay = day
        }


    }
}