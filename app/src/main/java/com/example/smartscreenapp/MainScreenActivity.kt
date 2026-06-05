package com.example.smartscreenapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainScreenActivity : AppCompatActivity() {
    val days = arrayOfNulls<String>(7)
    val morningTime = IntArray(7)
    val afternoonTime = IntArray(7)
    val notes = arrayOfNulls<String>(7)
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val dateEditText = findViewById<EditText>(R.id.dateEditText)
        val morningEditText = findViewById<EditText>(R.id.morningEditText)
        val afternoonEditText = findViewById<EditText>(R.id.afternoonEditText)
        val notesEditText = findViewById<EditText>(R.id.notesEditText)
        val addButton = findViewById<Button>(R.id.addButton)
        val clearButton = findViewById<Button>(R.id.clearButton)
        val viewButton = findViewById<Button>(R.id.viewButton)
        val feedbackTextView = findViewById<TextView>(R.id.feedbackTextView)

        addButton.setOnClickListener {
            if (counter >= 7){
                feedbackTextView.text = "All entries full"
            } else {
                days[counter] = dateEditText.text.toString()
                morningTime[counter] = morningEditText.text.toString().toInt()
                afternoonTime[counter] = afternoonEditText.text.toString().toInt()
                notes[counter] = notesEditText.text.toString()

                counter ++
                feedbackTextView.text ="Entry added successfully"

            }

        }

        clearButton.setOnClickListener {
            dateEditText.text.clear()
            morningEditText.text.clear()
            afternoonEditText.text.clear()
            notesEditText.text.clear()
            feedbackTextView.text = "Fields Cleared"
        }

        viewButton.setOnClickListener{
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("counter", counter)
            intent.putExtra("days", days)
            intent.putExtra("morningTime", morningTime)
            intent.putExtra("afternoonTime", morningTime)
            intent.putExtra("notes", notes)
            startActivity(intent)

        }












        setContentView(R.layout.activity_main_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}