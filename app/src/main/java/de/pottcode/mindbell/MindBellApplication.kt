package de.pottcode.mindbell

import android.app.Application
import de.pottcode.mindbell.di.AppComponent
import de.pottcode.mindbell.di.DaggerAppComponent
import de.pottcode.mindbell.schedule.worker.AppWorkerFactory

/**
 * (c) Dimitri Simon on 2020-03-16
 */

open class MindBellApplication : Application() {
    open val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(applicationContext)
    }
    open val factory: AppWorkerFactory by lazy {
        DaggerAppComponent.factory().create(applicationContext).appWorkerFactory()
    }
}
