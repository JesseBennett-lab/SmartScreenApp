package com.example.smartscreenapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)

        val detailTextView = findViewById<TextView>(R.id.detailTextView)
        val backButton = findViewById<Button>(R.id.backButton)

        val counter = intent.getIntExtra("counter", 0)
        val days = intent.getSerializableExtra("days") as Array<String?>
        val morningTime = intent.getIntArrayExtra("morningTime")
        val afternoonTime = intent.getIntArrayExtra("afternoonTime")
        val notes = intent.getSerializableExtra("notes") as Array<String?>

        var display = "Screen Time Entries:\n\n"
        var index = 0



        while (index < counter ) {
            display = display + "Day" + days?.get(index) + "\n"
            display = display + "Morning:" + morningTime?.get(index) + "mins\n"
            display = display +"Afternoon:" + afternoonTime?.get(index) + "mins\n"
            display= display + "Notes" +notes?.get(index) + "\n"
            display = display + "---------------------\n"
            index++
        }

        detailTextView.text = display

        backButton.setOnClickListener {
            finish()

        }










        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}