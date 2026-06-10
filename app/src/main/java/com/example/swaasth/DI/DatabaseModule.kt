package com.example.swaasth.DI

import android.content.Context
import androidx.room.Room
import com.example.swaasth.model.AppDatabase
import com.example.swaasth.model.UserDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    // AppDatabase kaise banao — Hilt ye recipe follow karega
    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): AppDatabase {
        return AppDatabase.getDatabase(context)
    }

    // UserDao kahan se lo — AppDatabase se nikalo
    @Provides
    fun provideUserDao(database: AppDatabase): UserDao {
        return database.userDao()
    }
}
