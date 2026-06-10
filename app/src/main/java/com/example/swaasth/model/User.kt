package com.example.swaasth.model

data class User(

    // Identity
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

enum class Gender {
    MALE,
    FEMALE,
    OTHER
}

enum class BloodGroup {
    A_POS, A_NEG,
    B_POS, B_NEG,
    AB_POS, AB_NEG,
    O_POS, O_NEG
}
