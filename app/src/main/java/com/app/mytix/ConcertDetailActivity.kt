package com.app.mytix

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.app.mytix.data.ConcertRepository

class ConcertDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_concert_detail)

        val id = intent.getIntExtra("ID", -1)
        val data = ConcertRepository.getConcertById(id)

        val img = findViewById<ImageView>(R.id.imgDetail)
        val name = findViewById<TextView>(R.id.tvName)
        val desc = findViewById<TextView>(R.id.tvDesc)

        val location = findViewById<TextView>(R.id.tvLocation)
        val date = findViewById<TextView>(R.id.tvDate)

        if (data != null) {
            img.setImageResource(data.imageResId)
            name.text = data.name
            desc.text = data.description

            location.text = "📍 ${data.location}"
            date.text = "🕒 ${data.date}"
        }
    }
}