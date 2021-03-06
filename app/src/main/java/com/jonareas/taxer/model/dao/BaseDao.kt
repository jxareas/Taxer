package com.jonareas.taxer.model.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update
import com.jonareas.taxer.model.entity.Persistable
import kotlinx.coroutines.flow.Flow

interface BaseDao<T : Persistable> {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(entity : T)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(vararg entity : T)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun update(entity : T)

    @Delete
    fun delete(entity : T)

    @Delete
    fun delete(vararg entity : T)

    fun getById(id : Long) : Flow<T>

    fun getAll() : Flow<List<T>>




}
