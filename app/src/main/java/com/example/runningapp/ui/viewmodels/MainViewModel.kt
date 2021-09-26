package com.example.runningapp.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.runningapp.db.Run
import com.example.runningapp.repositories.MainRepository
import kotlinx.coroutines.launch

class MainViewModel @ViewModelInject constructor(
        val mainRepository: MainRepository
): ViewModel() {
    val runsSortedByDate = mainRepository.getAllRunsSortedByDate()
    fun insertRun(run: Run) = viewModelScope.launch {
        mainRepository.insertRun(run)
    }
}