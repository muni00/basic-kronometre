package com.muazzeznihalbahadir.nazarboncugu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var num =0
    var runnable : Runnable = Runnable {  }
    var handler = Handler(Looper.myLooper()!!)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun baslat (view:View){
        runnable = object :Runnable{
            override fun run() {
                num=num+1
                textView.text = "Sayac : ${num}"
                handler.postDelayed(runnable,1000)

            }

        }
        handler.post(runnable)
    }
    fun durdur(view:View){
        handler.removeCallbacks(runnable)
        num=0
        textView.text = "Sayac : 0"

    }
}
