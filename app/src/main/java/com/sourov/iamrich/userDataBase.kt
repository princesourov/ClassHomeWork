package com.sourov.iamrich

import androidx.room.Database
import androidx.room.RoomDatabase

@Database (entities = [user::class], version = 1)
abstract class userDataBase : RoomDatabase() {

    abstract fun getUserDao(): UserDao

}