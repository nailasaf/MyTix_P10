package com.app.mytix

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import android.content.Intent
class MainActivity : AppCompatActivity() {

    private lateinit var recyclerConcert: RecyclerView
    private lateinit var concertList: ArrayList<Concert>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigation)

        bottomNav.setOnItemSelectedListener {

            when(it.itemId){

                R.id.nav_ticket -> {

                    startActivity(
                        Intent(this, TicketActivity::class.java)
                    )

                    true
                }

                else -> true
            }
        }

        recyclerConcert = findViewById(R.id.recyclerConcert)

        concertList = arrayListOf(
            Concert(R.drawable.img_exo, "EXO", "Mulai Rp 1.5jt"),
            Concert(R.drawable.img_bts, "BTS", "Mulai Rp 1.8jt"),
            Concert(R.drawable.img_coldplay, "Coldplay", "Mulai Rp 2jt"),
            Concert(R.drawable.img_niki, "NIKI", "Mulai Rp 750rb")
        )

        recyclerConcert.layoutManager = GridLayoutManager(this, 2)

        recyclerConcert.adapter = ConcertAdapter(concertList)
    }
}