package com.example.onactivityresult

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import kotlinx.android.synthetic.main.activity_main.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val checkBox = findViewById<CheckBox>(R.id.checkbox)
        val checkboxOne = findViewById<CheckBox>(R.id.checkboxOne)
        val checkboxTwo = findViewById<CheckBox>(R.id.checkboxTwo)
        val buttonBack = findViewById<Button>(R.id.buttonBack)

        var forrest: String? = null
        var legend: String? = null
        var fracture: String? = null

        buttonBack.setOnClickListener {
            val intent = Intent()

            if (checkBox.isChecked) {
                forrest = checkBox.text.toString()

            }  else {
                forrest = "Не выбрано"
            }

            if (checkboxOne.isChecked){
                legend = checkboxOne.text.toString()
            }
            else{
                legend = "Не выбрано"
            }
            if (checkboxTwo.isChecked){
                fracture = checkboxTwo.text.toString()
            }
            else{
                fracture = "Не выбрано"
            }

            intent.putExtra("forrest", forrest)
            intent.putExtra("legend", legend)
            intent.putExtra("fracture", fracture)

            setResult(Activity.RESULT_OK, intent)
            finish()



        }








    }
}