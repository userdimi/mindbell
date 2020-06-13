package de.pottcode.mindbell

import android.app.Application
import androidx.work.Configuration
import androidx.work.WorkManager
import androidx.work.WorkerFactory
import com.bugsnag.android.Bugsnag
import de.pottcode.mindbell.di.AppComponent
import de.pottcode.mindbell.di.DaggerAppComponent
import de.pottcode.mindbell.schedule.worker.AppWorkerFactory
import javax.inject.Inject

/**
 * (c) Dimitri Simon on 2020-03-16
 */

open class MindBellApplication : Application() {

    @Inject
    lateinit var workerFactory: WorkerFactory

    override fun onCreate() {
        super.onCreate()
        Bugsnag.start(this)
        WorkManager.initialize(this, Configuration.Builder().setWorkerFactory(factory).build())
    }

    open val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(applicationContext)
    }
    open val factory: AppWorkerFactory by lazy {
        DaggerAppComponent.factory().create(applicationContext).appWorkerFactory()
    }
}
