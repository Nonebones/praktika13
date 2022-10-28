package com.example.praktika13


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun OnClick(view: View) {
        val editText: EditText = findViewById(R.id.editTextNumber)
        val editText1: EditText = findViewById(R.id.editTextNumber2)
        var resultText: TextView = findViewById(R.id.textView)
        val dollar:Int = editText.text.toString().toInt()
        val rubs = editText1.text.toString().toInt()
        editText.requestFocus()

         if (dollar != null){

            val result = dollar * rubs
             resultText.text = "Результат : $result"

         } else {

             val toast1:Toast= Toast.makeText(applicationContext,"Введите курс обмена",Toast.LENGTH_SHORT)
             toast1.show()

         }
        if (rubs == null){

            val toast2:Toast= Toast.makeText(applicationContext,"Введите сумму для обмена",Toast.LENGTH_SHORT)
            toast2.show()
        }
    }

}