plugins {
    id("org.jetbrains.compose") version "0.3.0-build133"
    id("com.android.application")
    kotlin("android")
}

group = "pl.mareklangiewicz"
version = "0.1"

repositories {
    google()
}

dependencies {
    implementation(project(":common"))
}

android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "pl.mareklangiewicz.android"
        minSdkVersion(24)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}
