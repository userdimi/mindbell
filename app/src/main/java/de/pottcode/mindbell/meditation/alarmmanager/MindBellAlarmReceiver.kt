package de.pottcode.mindbell.meditation.alarmmanager

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import de.pottcode.mindbell.MindBellApplication
import de.pottcode.mindbell.player.MindBellPlayer
import javax.inject.Inject

/**
 * (c) Dimitri Simon on 29.03.20
 */
class MindBellAlarmReceiver : BroadcastReceiver() {

    @Inject
    lateinit var mindBellPlayer: MindBellPlayer

    override fun onReceive(context: Context?, intent: Intent?) {
        (context?.applicationContext as MindBellApplication).appComponent.inject(this)
        mindBellPlayer.playBellSound()
    }
}
