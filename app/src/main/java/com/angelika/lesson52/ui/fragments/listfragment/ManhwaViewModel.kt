package com.angelika.lesson52.ui.fragments.listfragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.angelika.lesson52.data.repositories.ManhwaRepository
import com.angelika.lesson52.models.Manhwa

class ManhwaViewModel : ViewModel() {

    private val repository = ManhwaRepository

    private val _manhwaLiveData = MutableLiveData(ManwhaUiState())
    val manhwa: LiveData<ManwhaUiState> = _manhwaLiveData

    fun getManhwas() {
        val data = repository.getManhwas()
        val newValue = _manhwaLiveData.value?.copy(isLoading = false, success = data)
        _manhwaLiveData.value = newValue
    }
}

data class ManwhaUiState(
    val isLoading: Boolean = true,
    val error: String = "error",
    val success: List<Manhwa> = emptyList()
)