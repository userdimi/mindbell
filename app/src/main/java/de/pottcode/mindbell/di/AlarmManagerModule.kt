package de.pottcode.mindbell.di

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import dagger.Module
import dagger.Provides
import de.pottcode.mindbell.meditation.alarmmanager.MindBellIntentCreator

/**
 * (c) Dimitri Simon on 30.03.20
 */
@Module
class AlarmManagerModule {

    @Provides
    fun providesAlarmManager(context: Context): AlarmManager {
        return context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
    }

    @Provides
    fun providesPendingIntent(context: Context): PendingIntent {
        return MindBellIntentCreator.createMeditationBellPendingIntent(context)
    }
}
