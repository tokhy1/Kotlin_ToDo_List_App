package com.example.todolist

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface DAO {
    @Insert
    fun insertTask(entity: Entity)

    @Update
    fun updateTask(entity: Entity)

    @Delete
    fun deleteTask(entity: Entity)

    @Query("DELETE FROM to_do")
    fun deleteAll()

    @Query("SELECT * FROM to_do ORDER BY id ASC")
    fun getTasks(): List<CardInfo>
}