package de.pottcode.mindbell.player

import android.media.AudioAttributes
import android.media.MediaPlayer
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.MockK
import io.mockk.verify
import org.junit.Before
import org.junit.Test

/**
 * (c) Dimitri Simon on 2020-03-18
 */
class MindBellPlayerViewModelTest {

    private lateinit var mindBellPlayerViewModel: MindBellPlayerViewModel

    @MockK
    private lateinit var mockMediaPlayer: MediaPlayer

    @MockK
    private lateinit var mockAudioAttributes: AudioAttributes

    @Before
    fun setUp() {
        MockKAnnotations.init(this, relaxed = true)
        mindBellPlayerViewModel = MindBellPlayerViewModel(
            mockMediaPlayer,
            mockAudioAttributes
        )
    }

    @Test
    fun verifyThatBellIsPlaying() {
        // act
        mindBellPlayerViewModel.playBell()
        // assert
        verify { mockMediaPlayer.setAudioAttributes(mockAudioAttributes) }
        verify { mockMediaPlayer.start() }
    }
}
