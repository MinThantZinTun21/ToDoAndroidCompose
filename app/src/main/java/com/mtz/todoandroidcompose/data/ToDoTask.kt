package com.mtz.todoandroidcompose.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.mtz.todoandroidcompose.util.Constant
import com.mtz.todoandroidcompose.util.Priority


@Entity(tableName = Constant.DATABASE_TABLE_NAME)
data class ToDoTask(

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
val priority:Priority

    )