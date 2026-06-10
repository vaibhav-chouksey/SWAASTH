package com.example.swaasth.model

import androidx.room.TypeConverter

class Converters {

    // LIST → STRING (called when SAVING to database)
    // ["Penicillin", "Peanuts", "Dust"] → "Penicillin,Peanuts,Dust"
    @TypeConverter
    fun fromList(list: List<String>): String {
        return list.joinToString(",")
    }

    // STRING → LIST (called when READING from database)
    // "Penicillin,Peanuts,Dust" → ["Penicillin", "Peanuts", "Dust"]
    @TypeConverter
    fun toList(value: String): List<String> {
        if (value.isEmpty()) return emptyList()
        return value.split(",")
    }

}