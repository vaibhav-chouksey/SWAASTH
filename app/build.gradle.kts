plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    //gradle
    alias(libs.plugins.hilt.android)
    alias(libs.plugins.ksp)
    //roomdb
//    id("com.android.application")
//    id("org.jetbrains.kotlin.android")
//  //  id("com.google.devtools.ksp")          // KSP — replaces kapt for Room
////    id("com.google.devtools.ksp")
}

android {
    namespace = "com.example.swaasth"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "com.example.swaasth"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
   // network
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    //location
    implementation("com.google.android.gms:play-services-location:21.3.0")
    implementation("androidx.compose.runtime:runtime-livedata:1.7.8")
    //image
    implementation("io.coil-kt:coil-compose:2.5.0")
    //navigaton
    implementation("androidx.navigation:navigation-compose:2.7.4")
    //gradle
    implementation(libs.hilt.android)
    ksp(libs.hilt.compiler)
    implementation(libs.hilt.navigation.compose)
    //room db
    val roomVersion = "2.6.1"

    implementation("androidx.room:room-runtime:$roomVersion")
    implementation("androidx.room:room-ktx:$roomVersion")      // coroutines support
    ksp("androidx.room:room-compiler:$roomVersion")            // annotation processor
//    val roomVersion = "2.6.1"
//
//    implementation("androidx.room:room-runtime:$roomVersion")
//    implementation("androidx.room:room-ktx:$roomVersion") // For Flow/Coroutines
//    ksp("androidx.room:room-compiler:$roomVersion")
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    debugImplementation(libs.androidx.compose.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
}