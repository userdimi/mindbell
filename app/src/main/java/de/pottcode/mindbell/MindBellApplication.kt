package de.pottcode.mindbell

import android.app.Application
import de.pottcode.mindbell.di.AppComponent
import de.pottcode.mindbell.di.DaggerAppComponent

/**
 * (c) Dimitri Simon on 2020-03-16
 */
open class MindBellApplication : Application() {
    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(applicationContext)
    }
}
