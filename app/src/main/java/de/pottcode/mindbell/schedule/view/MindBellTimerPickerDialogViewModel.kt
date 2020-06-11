package de.pottcode.mindbell.schedule.view

import android.app.AlarmManager
import android.app.PendingIntent
import androidx.lifecycle.ViewModel
import javax.inject.Inject

/**
 * (c) Dimitri Simon on 11.04.20
 */
class MindBellTimerPickerDialogViewModel @Inject constructor(
    private val mindBellAlarmManager: AlarmManager,
    private val alarmPendingIntent: PendingIntent
) : ViewModel() {

    fun scheduleBell(scheduleBellTimeInMilliSeconds: Long) {
        mindBellAlarmManager.apply {
            setInexactRepeating(
                AlarmManager.RTC_WAKEUP,
                scheduleBellTimeInMilliSeconds,
                2 * MILLISECONDS_TO_MINUTES_FACTOR,
                alarmPendingIntent
            )
        }
    }

    companion object {
        private const val MILLISECONDS_TO_MINUTES_FACTOR: Long = 60000
    }
}
