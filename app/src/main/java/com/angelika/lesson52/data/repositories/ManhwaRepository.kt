package com.angelika.lesson52.data.repositories

import com.angelika.lesson52.models.Manhwa

object ManhwaRepository {
    private val manhwas = arrayListOf(
        Manhwa(
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSAuJcFvnb1ulQwYdmgGnB4rxyrZ7dDWUvH6Q&usqp=CAU",
            "Petlya"
        )
    )

    fun getManhwas(): List<Manhwa> {
        return manhwas
    }

    fun addManhwa(manhwa: Manhwa) {
        manhwas.add(manhwa)
    }
}