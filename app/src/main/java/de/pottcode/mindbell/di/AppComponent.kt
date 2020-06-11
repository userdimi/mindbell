package de.pottcode.mindbell.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import de.pottcode.mindbell.meditation.MeditationBellFragment
import de.pottcode.mindbell.meditation.alarmmanager.MindBellAlarmReceiver
import de.pottcode.mindbell.schedule.view.MindBellTimePickerDialog
import de.pottcode.mindbell.schedule.view.ScheduleBellFragment
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
        WorkManagerModule::class,
        AlarmManagerModule::class
    ]
)
interface AppComponent {

    fun appWorkerFactory(): AppWorkerFactory
    fun inject(mindBellPlayerFragment: MeditationBellFragment)
    fun inject(scheduleBellFragment: ScheduleBellFragment)
    fun inject(mindBellAlarmReceiver: MindBellAlarmReceiver)
    fun inject(mindBellTimePickerDialog: MindBellTimePickerDialog)

    // Factory to create instances of the AppComponent
    @Component.Factory
    interface Factory {
        // With @BindsInstance, the Context passed in will be available in the graph
        fun create(@BindsInstance context: Context): AppComponent
    }
}
