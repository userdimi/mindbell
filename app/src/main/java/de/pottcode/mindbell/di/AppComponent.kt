package de.pottcode.mindbell.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import de.pottcode.mindbell.player.MindBellPlayerFragment
import javax.inject.Singleton

/**
 * (c) Dimitri Simon on 2020-03-16
 */
@Singleton
@Component(modules = [MediaPlayerModule::class])
interface AppComponent {

    fun inject(mindBellPlayerFragment: MindBellPlayerFragment)

    // Factory to create instances of the AppComponent
    @Component.Factory
    interface Factory {
        // With @BindsInstance, the Context passed in will be available in the graph
        fun create(@BindsInstance context: Context): AppComponent
    }
}
