package de.pottcode.mindbell.schedule.worker

import android.content.Context
import androidx.work.WorkerParameters
import de.pottcode.mindbell.player.MindBellPlayer
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.MockK
import io.mockk.verify
import org.junit.Before
import org.junit.Test

/**
 * (c) Dimitri Simon on 28.03.20
 */
class MindBellWorkerTest {

    private lateinit var mindBellWorker: MindBellWorker

    @MockK
    private lateinit var mockContext: Context

    @MockK
    private lateinit var mockWorkerParameters: WorkerParameters

    @MockK
    private lateinit var mockMindBellPlayer: MindBellPlayer

    @Before
    fun setUp() {
        MockKAnnotations.init(this, relaxed = true)
        mindBellWorker = MindBellWorker(mockContext, mockWorkerParameters, mockMindBellPlayer)
    }

    @Test
    fun verifyThatBellSoundIsPlayedOnDoWork() {
        // act
        mindBellWorker.doWork()

        // assert
        verify { mockMindBellPlayer.playBellSound() }
    }
}
