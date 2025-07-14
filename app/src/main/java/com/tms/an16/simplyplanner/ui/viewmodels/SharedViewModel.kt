package com.tms.an16.simplyplanner.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tms.an16.simplyplanner.data.model.Task
import com.tms.an16.simplyplanner.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SharedViewModel @Inject constructor(private val repository: Repository) : ViewModel() {

    private val allTasks = MutableStateFlow<List<Task>>(emptyList())
    val allTaskss: StateFlow<List<Task>> = allTasks

    fun getAllTasks() {
        viewModelScope.launch {
            repository.getAllTasks.collect {
                allTasks.value = it
            }
        }
    }
}