package com.app.mytix

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class TicketActivity : AppCompatActivity() {

    private lateinit var recyclerTicket: RecyclerView
    private lateinit var ticketList: ArrayList<Ticket>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ticket)

        // BOTTOM NAVIGATION
        val bottomNav =
            findViewById<BottomNavigationView>(
                R.id.bottomNavigationTicket
            )

        bottomNav.selectedItemId = R.id.nav_ticket

        bottomNav.setOnItemSelectedListener {

            when(it.itemId){

                R.id.nav_home -> {

                    startActivity(
                        Intent(this, MainActivity::class.java)
                    )

                    true
                }

                else -> true
            }
        }

        recyclerTicket = findViewById(R.id.recyclerTicket)

        ticketList = arrayListOf(

            Ticket(
                R.drawable.img_exo,
                "EXO",
                "VIP • 2 Tiket",
                "07 Juni 2026",
                "Rp 3.000.000"
            ),

            Ticket(
                R.drawable.img_bts,
                "BTS",
                "CAT 1 • 1 Tiket",
                "26 Desember 2026",
                "Rp 3.000.000"
            ),

            Ticket(
                R.drawable.img_coldplay,
                "Coldplay",
                "CAT 2 • 2 Tiket",
                "28 Mei 2026",
                "Rp 2.400.000"
            ),

            Ticket(
                R.drawable.img_niki,
                "NIKI",
                "CAT 3 • 1 Tiket",
                "5 Juni 2026",
                "Rp 750.000"
            )
        )

        recyclerTicket.layoutManager =
            LinearLayoutManager(this)

        recyclerTicket.adapter =
            TicketAdapter(ticketList)
    }
}