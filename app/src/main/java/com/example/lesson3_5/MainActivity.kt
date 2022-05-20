package com.example.lesson3_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var textView : TextView? = null
    private var button:Button ? = null
    private var summ : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView= findViewById(R.id.text_view)
        button = findViewById(R.id.btn_click)
        button?.setOnClickListener {
            if (summ < 11 && button?.text == "+1"){
                summ++
                textView?.text = summ.toString()
                if (summ == 10){
                    button?.text = "-1"
                }
            }
            else {
                summ --
                textView?.text= summ.toString()
                if (summ == 0 && button?.text == "-1"){
                    button?.text = "+1"
                }
            }
        }

    }

}