package com.iesam.ex_22_23_psp_marzo.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iesam.ex_22_23_psp_marzo.domain.Animal
import com.iesam.ex_22_23_psp_marzo.domain.GetAdoptionsUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val getAdoptions: GetAdoptionsUseCase) : ViewModel() {

    private var _uiState = MutableLiveData<UiState>()
    val uiState: LiveData<UiState> = _uiState

    fun loadAdoptions() {
        viewModelScope.launch (Dispatchers.IO){
            val adoptions = getAdoptions.invoke()
            _uiState.postValue(UiState(adoptions= adoptions))
        }
    }

    data class UiState(
        val adoptions: List<Animal> = emptyList()
    )

}