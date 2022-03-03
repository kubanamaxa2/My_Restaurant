package com.example.myrestaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a = ""
        findViewById<Button>(R.id.button).setOnClickListener{
            if(findViewById<CheckBox>(R.id.checkBox).isChecked == true){
            a += "pIZZA z sALAMI \n"
            }
            if(findViewById<CheckBox>(R.id.checkBox3).isChecked == true){
                a += "pIZZA z mARGARITA \n"
            }
            if(findViewById<CheckBox>(R.id.checkBox4).isChecked == true){
                a += "pIZZA z vEGE \n"
            }
            if(findViewById<CheckBox>(R.id.checkBox5).isChecked == true){
                a += "pIZZA z wIEŚNIAKIEM\n"
            }
            if(findViewById<CheckBox>(R.id.checkBox6).isChecked == true){
                a += "pIZZA z tAKIM tAM aNANASEM \n"
            }
            if(findViewById<CheckBox>(R.id.checkBox7).isChecked == true){
                a += "pIZZA z gRACJĄ \n"
            }
            if(findViewById<CheckBox>(R.id.checkBox8).isChecked == true){
                a += "pIZZA z pIECZARKAMI \n"
            }
            findViewById<TextView>(R.id.textView).text = a
            if(findViewById<CheckBox>(R.id.checkBox).isChecked == false && findViewById<CheckBox>(R.id.checkBox3).isChecked == false &&
                findViewById<CheckBox>(R.id.checkBox4).isChecked == false && findViewById<CheckBox>(R.id.checkBox5).isChecked == false &&
                findViewById<CheckBox>(R.id.checkBox6).isChecked == false && findViewById<CheckBox>(R.id.checkBox7).isChecked == true &&
                findViewById<CheckBox>(R.id.checkBox8).isChecked == false  ){
                a = ""
            }
        }
    }
}