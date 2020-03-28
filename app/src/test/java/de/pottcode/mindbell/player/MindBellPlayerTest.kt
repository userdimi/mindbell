package de.pottcode.mindbell.player

import android.media.AudioAttributes
import android.media.MediaPlayer
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.MockK
import io.mockk.verify
import org.junit.Before
import org.junit.Test

/**
 * (c) Dimitri Simon on 28.03.20
 */
class MindBellPlayerTest {

    private lateinit var mindBellPlayer: MindBellPlayer

    @MockK
    private lateinit var mockMediaPlayer: MediaPlayer

    @MockK
    private lateinit var mockAudioAttributes: AudioAttributes

    @Before
    fun setUp() {
        MockKAnnotations.init(this, relaxed = true)
        mindBellPlayer = MindBellPlayer(mockMediaPlayer, mockAudioAttributes)
    }

    @Test
    fun verifyThatPlayerIsStartedWithAudioAttributes() {
        // act
        mindBellPlayer.playBellSound()

        // assert
        verify { mockMediaPlayer.setAudioAttributes(mockAudioAttributes) }
        verify { mockMediaPlayer.start() }
    }
}
