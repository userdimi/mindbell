package de.pottcode.mindbell.meditation.alarmmanager

import android.app.PendingIntent
import android.content.Context
import android.content.Intent

/**
 * (c) Dimitri Simon on 30.03.20
 */
class MindBellIntentCreator : Intent() {
    companion object {
        fun createMeditationBellPendingIntent(context: Context): PendingIntent {
            return Intent(context, MindBellAlarmReceiver::class.java).let { intent ->
                PendingIntent.getBroadcast(context, 0, intent, 0)
            }
        }
    }
}
