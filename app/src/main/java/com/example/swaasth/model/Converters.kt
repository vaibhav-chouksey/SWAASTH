package com.example.swaasth.model

import androidx.room.TypeConverter

class Converters {

    // LIST → STRING

    @TypeConverter
    fun fromList(list: List<String>): String {
        return list.joinToString(",")
    }

    // STRING → LIST

    @TypeConverter
    fun toList(value: String): List<String> {
        if (value.isEmpty()) return emptyList()
        return value.split(",")
    }

}
