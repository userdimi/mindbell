package de.pottcode.mindbell.player

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
    private lateinit var mockMindBellPlayer: MindBellPlayer

    @Before
    fun setUp() {
        MockKAnnotations.init(this, relaxed = true)
        mindBellPlayerViewModel = MindBellPlayerViewModel(mockMindBellPlayer)
    }

    @Test
    fun verifyThatBellIsPlaying() {
        // act
        mindBellPlayerViewModel.playBell()
        // assert
        verify { mockMindBellPlayer.playBellSound() }
    }
}
