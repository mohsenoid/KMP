plugins {
    id("com.android.application")
    kotlin("android")
    id("org.jlleitschuh.gradle.ktlint") version "10.0.0"
    id("io.gitlab.arturbosch.detekt") version "1.17.1"
}

group = "com.mohsenoid"
version = "1.0-SNAPSHOT"

dependencies {
    implementation(project(":shared"))

    implementation ("androidx.core:core-ktx:1.5.0")
    implementation("androidx.appcompat:appcompat:1.3.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.0.4")

    implementation ("com.google.android.material:material:1.3.0")

    testImplementation ("junit:junit:4.13.2")

    androidTestImplementation ("androidx.test.ext:junit:1.1.2")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.3.0")
}

android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "com.mohsenoid.androidApp"
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
