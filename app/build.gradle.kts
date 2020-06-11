plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
}

android {
    compileSdkVersion(apiLevel = 29)
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
        android.buildFeatures.dataBinding = true
    }

    testOptions {
        unitTests.isReturnDefaultValues = true
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions.jvmTarget = "1.8"
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.72")
    val legacySupportVersion = "1.0.0"
    implementation("androidx.legacy:legacy-support-v4:$legacySupportVersion")
    val androidLifecycleVersion = "2.2.0"
    implementation("androidx.lifecycle:lifecycle-extensions:$androidLifecycleVersion")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$androidLifecycleVersion")
    val appCompatVersion = "1.1.0"
    implementation("androidx.appcompat:appcompat:$appCompatVersion")
    val androidCoreVersion = "1.3.0"
    implementation("androidx.core:core-ktx:$androidCoreVersion")
    val navigationComponentsVersion = "2.3.0-rc01"
    implementation("androidx.navigation:navigation-fragment-ktx:$navigationComponentsVersion")
    implementation("androidx.navigation:navigation-ui-ktx:$navigationComponentsVersion")
    val dagger2Version = "2.28"
    implementation("com.google.dagger:dagger:$dagger2Version")
    kapt("com.google.dagger:dagger-compiler:$dagger2Version")
    implementation("com.google.dagger:dagger-android:$dagger2Version")
    implementation("com.google.dagger:dagger-android-support:$dagger2Version")
    kapt("com.google.dagger:dagger-android-processor:$dagger2Version")
    val dagger2Assist = "0.5.2"
    compileOnly("com.squareup.inject:assisted-inject-annotations-dagger2:$dagger2Assist")
    kapt("com.squareup.inject:assisted-inject-processor-dagger2:$dagger2Assist")
    val workManagerVersion = "2.3.4"
    implementation("androidx.work:work-runtime:$workManagerVersion")
    implementation("androidx.work:work-runtime-ktx:$workManagerVersion")
    implementation("androidx.work:work-rxjava2:$workManagerVersion")
    val constraintLayoutVersion = "1.1.3"
    implementation("androidx.constraintlayout:constraintlayout:$constraintLayoutVersion")
    val materialComponentsVersion = "1.3.0-alpha01"
    implementation("com.google.android.material:material:$materialComponentsVersion")
    val timberVersion = "4.7.1"
    implementation("com.jakewharton.timber:timber:$timberVersion")
    val jUnitVersion = "4.13"
    testImplementation("junit:junit:$jUnitVersion")
    val mockkVersion = "1.10.0"
    testImplementation("io.mockk:mockk:$mockkVersion")
    val androidJUnitVersion = "1.1.1"
    androidTestImplementation("androidx.test.ext:junit:$androidJUnitVersion")
    val testFragmentVersion = "1.2.5"
    debugImplementation("androidx.fragment:fragment-testing:$testFragmentVersion")
    val espressoVersion = "3.2.0"
    androidTestImplementation("androidx.test.espresso:espresso-core:$espressoVersion")
}
