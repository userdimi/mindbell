package de.pottcode.mindbell.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import de.pottcode.mindbell.schedule.ScheduleBellFragment

/**
 * (c) Dimitri Simon on 2020-03-16
 */
@Component
interface AppComponent {

    fun inject(scheduleBellFragment: ScheduleBellFragment)

    // Factory to create instances of the AppComponent
    @Component.Factory
    interface Factory {
        // With @BindsInstance, the Context passed in will be available in the graph
        fun create(@BindsInstance context: Context): AppComponent
    }
}
