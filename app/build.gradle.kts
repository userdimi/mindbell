import org.jetbrains.kotlin.config.KotlinCompilerVersion

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(29)
    defaultConfig {
        applicationId = "de.pottcode.mindbell"
        minSdkVersion(21)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(kotlin("stdlib-jdk7", KotlinCompilerVersion.VERSION))
    val appCompatVersion = "1.1.0"
    implementation("androidx.appcompat:appcompat:$appCompatVersion")
    val androidCoreVersion = "1.2.0"
    implementation("androidx.core:core-ktx:$androidCoreVersion")
    val constraintLayoutVersion = "1.1.3"
    implementation("androidx.constraintlayout:constraintlayout:$constraintLayoutVersion")
    val jUnitVersion = "4.12"
    testImplementation("junit:junit:$jUnitVersion")
    val androidJUnitVersion = "1.1.1"
    androidTestImplementation("androidx.test.ext:junit:$androidJUnitVersion")
    val espressoVersion = "3.2.0"
    androidTestImplementation("androidx.test.espresso:espresso-core:$espressoVersion")
}
