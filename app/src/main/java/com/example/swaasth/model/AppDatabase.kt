package com.example.swaasth.model

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room3.Database
import androidx.room3.TypeConverters

@Database(entities = [UserEntity::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "swaasth_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}