package com.example.swaasth.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "user_table")
data class UserEntity(

    // Identity
    @PrimaryKey
    val id: String = "",
    val name: String = "",
    val phone: String = "",
    val age: Int = 0,
    val gender: Gender = Gender.MALE,

    // Body DMNSN
    val heightCm: Float = 0f,
    val weightKg: Float = 0f,

    // Med BG
    val bloodGroup: BloodGroup = BloodGroup.O_POS,
    val allergies: List<String> = emptyList(),           // e.g. ["Penicillin", "Peanuts"]
    val chronicConditions: List<String> = emptyList(),   // e.g. ["Diabetes", "Hypertension"]

    // Emergency Contact
    val emergencyContactName: String = "",
    val emergencyContactPhone: String = "",
    val emergencyContactRelation: String = ""  // "Father", "Spouse"
)


