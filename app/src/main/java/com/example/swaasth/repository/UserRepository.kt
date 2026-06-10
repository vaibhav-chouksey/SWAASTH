package com.example.swaasth.repository

import com.example.swaasth.model.UserDao
import com.example.swaasth.model.UserEntity
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepository @Inject constructor(
    private val userDao: UserDao   // Hilt inject karega — tu kuch pass nahi karega
) {

    // User save karo database mein
    suspend fun insertUser(user: UserEntity) {
        userDao.insertUser(user)
    }

    // User update karo (koi field change hua)
    suspend fun updateUser(user: UserEntity) {
        userDao.updateUser(user)
    }

    // User delete karo
    suspend fun deleteUser(user: UserEntity) {
        userDao.deleteUser(user)
    }

    // ID se user nikalo — null bhi aa sakta hai agar nahi mila
    suspend fun getUserById(id: String): UserEntity? {
        return userDao.getUserById(id)
    }
}