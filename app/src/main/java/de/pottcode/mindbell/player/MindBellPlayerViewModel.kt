package de.pottcode.mindbell.player

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MindBellPlayerViewModel @Inject constructor(private val mindBellPlayer: MindBellPlayer) :
    ViewModel() {

    fun playBell() {
        mindBellPlayer.playBellSound()
    }
}
