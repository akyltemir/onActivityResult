package com.example.onactivityresult

import android.app.Activity
import android.app.Instrumentation
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView




class MainActivity : AppCompatActivity() {

    var textView: TextView? = null
    var textViewOne: TextView? = null
    var textViewTwo: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        textViewOne = findViewById(R.id.textViewOne)
        textViewTwo = findViewById(R.id.textViewTwo)


        val buttonClick = findViewById<Button>(R.id.buttonClick)

        buttonClick.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)

        }

        override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
            super.onActivityResult(requestCode, resultCode, data)

            if (requestCode == 1 && resultCode == Activity.RESULT_OK) {
                val forrest = data?.getStringExtra("forrest")
                textView?.text = forrest

                val legend = data?.getStringExtra("legend")
                textViewOne?.text = legend

                val fracture = data?.getStringExtra("fracture")
                textViewTwo?.text = fracture
            } else {
                Log.d("onActivityResult", "no data")


            }


        }


    }







    }
