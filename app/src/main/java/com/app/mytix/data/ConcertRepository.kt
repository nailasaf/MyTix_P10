package com.app.mytix.data

import com.app.mytix.R
import com.app.mytix.model.Concert

object ConcertRepository {

    fun getConcertById(id: Int): Concert? {
        return when (id) {
            1 -> Concert(
                1,
                "EXO PLANET",
                "Konser EXO spektakuler dengan lighting dan stage keren.",
                "Indonesia Arena",
                "7 Juni 2026",
                R.drawable.img_exo
            )
            2 -> Concert(
                2,
                "BTS WORLD TOUR ARIRANG",
                "Konser BTS global tour dengan performance epic.",
                "GBK",
                "26-27 Desember 2026",
                R.drawable.img_bts
            )
            else -> null
        }
    }
}