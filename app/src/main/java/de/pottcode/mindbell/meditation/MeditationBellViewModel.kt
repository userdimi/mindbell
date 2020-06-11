package de.pottcode.mindbell.meditation

import android.app.AlarmManager
import android.app.PendingIntent
import android.os.SystemClock
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MeditationBellViewModel @Inject constructor(
    private val mindBellAlarmManager: AlarmManager,
    private val alarmPendingIntent: PendingIntent
) : ViewModel() {

    companion object {
         const val BELL_INTERVAL_IN_MILLISECONDS = 3000L * 1000
    }

    fun startMeditation() {
        mindBellAlarmManager.apply {
            setRepeating(
                AlarmManager.ELAPSED_REALTIME_WAKEUP,
                SystemClock.elapsedRealtime(),
                BELL_INTERVAL_IN_MILLISECONDS,
                alarmPendingIntent
            )
        }
    }
}
