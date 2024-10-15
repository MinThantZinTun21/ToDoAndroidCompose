package com.mtz.todoandroidcompose.ui.theme.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mtz.todoandroidcompose.data.ToDoTask
import com.mtz.todoandroidcompose.data.TodoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ShareViewModel @Inject constructor(
    private val todoRepository: TodoRepository
) : ViewModel() {

    private val _allTask = MutableStateFlow<List<ToDoTask>>(listOf())

    private val allTask: StateFlow<List<ToDoTask>> = _allTask
    fun getAllTask() = viewModelScope.launch {
        todoRepository.getAllTask().collect {
            _allTask.value = it
        }
    }


}

