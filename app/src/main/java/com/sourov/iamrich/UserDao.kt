package com.sourov.iamrich

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface UserDao {

    @Insert
    fun addUser(User: user) : Long
}