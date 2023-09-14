package com.angelika.lesson52.ui.fragments.addmanhwa

import androidx.lifecycle.ViewModel
import com.angelika.lesson52.data.repositories.ManhwaRepository
import com.angelika.lesson52.models.Manhwa

class AddManhwaViewModel : ViewModel() {

    private val repository = ManhwaRepository

    fun addManhwa(manhwa: Manhwa) {
        repository.addManhwa(manhwa)
    }
}