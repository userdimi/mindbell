package de.pottcode.mindbell.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import de.pottcode.mindbell.player.MindBellPlayerFragment
import de.pottcode.mindbell.schedule.ScheduleBellFragment
import de.pottcode.mindbell.schedule.worker.AppWorkerFactory
import javax.inject.Singleton

/**
 * (c) Dimitri Simon on 2020-03-16
 */
@Singleton
@Component(
    modules = [MediaPlayerModule::class,
        AppAssistedInjectModule::class,
        WorkerBindingModule::class,
        WorkManagerModule::class
    ]
)
interface AppComponent {

    fun appWorkerFactory(): AppWorkerFactory
    fun inject(mindBellPlayerFragment: MindBellPlayerFragment)
    fun inject(scheduleBellFragment: ScheduleBellFragment)

    // Factory to create instances of the AppComponent
    @Component.Factory
    interface Factory {
        // With @BindsInstance, the Context passed in will be available in the graph
        fun create(@BindsInstance context: Context): AppComponent
    }
}
