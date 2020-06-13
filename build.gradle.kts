// Top-level build file where you can add configuration options common to all sub-projects/modules
buildscript {

    val kotlinVersion by rootProject.extra { "1.3.61" }

    repositories {
        google()
        jcenter()
    }
    dependencies {
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
        classpath("com.android.tools.build:gradle:4.0.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
        classpath("com.bugsnag:bugsnag-android-gradle-plugin:4.7.5")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}

