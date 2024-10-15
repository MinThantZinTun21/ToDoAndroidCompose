package com.mtz.todoandroidcompose.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface ToDoDao {


    @Query("SELECT * FROM todo_table ORDER BY id ASC")
    fun getAllToDoTasks(): Flow<List<ToDoTask>>

    @Query("SELECT * FROM todo_table WHERE id=:todoId")
    fun getSelectTask(todoId: Int): ToDoTask


    @Insert
    suspend fun addTask(task: ToDoTask)

    @Update
    suspend fun updateTask(task: ToDoTask)

    @Delete
    suspend fun deleteTask(task: ToDoTask)


    @Query("DELETE FROM todo_table")
    suspend fun deleteAllTask()


    @Query("SELECT * FROM todo_table WHERE title LIKE :searchText OR description LIKE :searchText")
    fun searchDatabase(searchText: String): Flow<List<ToDoTask>>


    @Query("SELECT * FROM todo_table ORDER BY CASE WHEN priority LIKE 'L%' THEN 1 WHEN priority LIKE 'M%' THEN 2 WHEN priority LIKE 'H%' THEN 3 ELSE 4 END ASC")
    fun sortByLowPriority(): Flow<List<ToDoTask>>

    @Query("SELECT * FROM todo_table ORDER BY CASE WHEN priority LIKE 'L%' THEN 4 WHEN priority LIKE 'M%' THEN 3 WHEN priority LIKE 'H%' THEN 2 ELSE 1 END ASC")
    fun sortByHight(): Flow<List<ToDoTask>>
}