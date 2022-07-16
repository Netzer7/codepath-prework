package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputString = findViewById<EditText>(R.id.editText).text
        // Tap a button to change text color of the label.
        findViewById<Button>(R.id.button).setOnClickListener {
            Log.i("Jacob", "Tapped on button")

            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
        }
        // Updates background color to purple
        findViewById<Button>(R.id.button2).setOnClickListener {
            Log.i("Jacob", "Tapped on button")

            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.purple_700))
        }
        // Updates the Hello string to you entered: (User input)
        findViewById<Button>(R.id.button3).setOnClickListener {
            Log.i("Jacob", "Tapped on button")

            findViewById<TextView>(R.id.textView).text = "You entered: $inputString"

        }
        // Resets text and background color to initial values.
        findViewById<ConstraintLayout>(R.id.backgroundView).setOnClickListener {
            Log.i("Jacob", "Tapped on button")

            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.black))
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor((getResources().getColor(R.color.teal_200)))
        }
    }
}