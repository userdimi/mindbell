import org.jetbrains.kotlin.config.KotlinCompilerVersion

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
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

    dataBinding {
        isEnabled = true
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions.jvmTarget = "1.8"
    }
}

dependencies {
    implementation(kotlin("stdlib-jdk7", KotlinCompilerVersion.VERSION))
    val legacySupportVersion = "1.0.0"
    implementation("androidx.legacy:legacy-support-v4:$legacySupportVersion")
    val androidLifecycleVersion = "2.0.0"
    implementation("androidx.lifecycle:lifecycle-extensions:$androidLifecycleVersion")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$androidLifecycleVersion")
    val appCompatVersion = "1.1.0"
    implementation("androidx.appcompat:appcompat:$appCompatVersion")
    val androidCoreVersion = "1.2.0"
    implementation("androidx.core:core-ktx:$androidCoreVersion")
    val navigationComponentsVersion = "2.3.0-alpha03"
    implementation("androidx.navigation:navigation-fragment-ktx:$navigationComponentsVersion")
    implementation("androidx.navigation:navigation-ui-ktx:$navigationComponentsVersion")
    val dagger2Version = "2.25.2"
    implementation("com.google.dagger:dagger:$dagger2Version")
    kapt("com.google.dagger:dagger-compiler:$dagger2Version")
    val workManagerVersion = "2.3.3"
    implementation("androidx.work:work-runtime-ktx:$workManagerVersion")
    val constraintLayoutVersion = "1.1.3"
    implementation("androidx.constraintlayout:constraintlayout:$constraintLayoutVersion")
    val materialComponentsVersion = "1.2.0-alpha05"
    implementation("com.google.android.material:material:$materialComponentsVersion")
    val jUnitVersion = "4.12"
    testImplementation("junit:junit:$jUnitVersion")
    val mockkVersion = "1.9.2"
    testImplementation("io.mockk:mockk:$mockkVersion")
    val androidJUnitVersion = "1.1.1"
    androidTestImplementation("androidx.test.ext:junit:$androidJUnitVersion")
    val testFragmentVersion = "1.2.2"
    debugImplementation("androidx.fragment:fragment-testing:$testFragmentVersion")
    val espressoVersion = "3.2.0"
    androidTestImplementation("androidx.test.espresso:espresso-core:$espressoVersion")
}
