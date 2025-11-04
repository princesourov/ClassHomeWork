package com.sourov.iamrich

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {

    @Insert
    fun addUser(User: user) : Long

    @Query("SELECT * FROM user")
    fun getAllUser(): List<user>
}