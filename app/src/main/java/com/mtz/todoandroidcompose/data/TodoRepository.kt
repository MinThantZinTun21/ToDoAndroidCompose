package com.mtz.todoandroidcompose.data

import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class TodoRepository @Inject constructor(private val todoDao: ToDoDao) {


    val sortByLowPriority = todoDao.sortByLowPriority()
    val sortByHight = todoDao.sortByHight()

    fun getAllTask() = todoDao.getAllToDoTasks()
    fun getSelectTask(todoId: Int) = todoDao.getSelectTask(todoId)

    suspend fun addTask(task: ToDoTask) = todoDao.addTask(task)

    suspend fun updateTask(task: ToDoTask) = todoDao.updateTask(task)

    suspend fun deleteTask(task: ToDoTask) = todoDao.deleteTask(task)

    suspend fun deleteAllTask() = todoDao.deleteAllTask()

    fun searchDatabase(searchText: String) = todoDao.searchDatabase(searchText)


}