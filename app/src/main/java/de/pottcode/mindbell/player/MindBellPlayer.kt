package de.pottcode.mindbell.player

import android.media.AudioAttributes
import android.media.MediaPlayer
import javax.inject.Inject

/**
 * (c) Dimitri Simon on 28.03.20
 */
class MindBellPlayer @Inject constructor(
    private val mediaPlayer: MediaPlayer,
    private val audioAttributes: AudioAttributes
) {
    fun playBellSound() {
        mediaPlayer.apply {
            setAudioAttributes(audioAttributes)
            start()
        }
    }
}
