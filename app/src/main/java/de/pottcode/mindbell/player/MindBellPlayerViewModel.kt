package de.pottcode.mindbell.player

import android.media.AudioAttributes
import android.media.MediaPlayer
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MindBellPlayerViewModel @Inject constructor(
    private val mediaPlayer: MediaPlayer,
    private val audioAttributes: AudioAttributes
) : ViewModel() {

    fun playBell() {
        mediaPlayer.apply {
            setAudioAttributes(audioAttributes)
            start()
        }
    }
}
