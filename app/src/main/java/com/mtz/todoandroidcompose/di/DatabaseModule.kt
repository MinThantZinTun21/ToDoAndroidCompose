package com.mtz.todoandroidcompose.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.mtz.todoandroidcompose.data.ToDoDatabase
import com.mtz.todoandroidcompose.util.Constant
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {


    @Singleton
    @Provides

    fun provideTodoDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(context, ToDoDatabase::class.java, Constant.DATABASE_NAME)
        .fallbackToDestructiveMigration()
        .build()


    @Singleton
    @Provides
    fun provideToDoDao(todoDatabase: ToDoDatabase) = todoDatabase.todoDao()
}