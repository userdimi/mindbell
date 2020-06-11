package de.pottcode.mindbell.meditation

import android.app.AlarmManager
import android.app.PendingIntent
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.MockK
import io.mockk.verify
import org.junit.Before
import org.junit.Test

/**
 * (c) Dimitri Simon on 2020-03-18
 */
class MeditationBellViewModelTest {

    private lateinit var meditationBellViewModel: MeditationBellViewModel

    @MockK
    private lateinit var mockMindBellAlarmManager: AlarmManager

    @MockK
    private lateinit var mockPendingAlarmIntent: PendingIntent

    @Before
    fun setUp() {
        MockKAnnotations.init(this, relaxed = true)
        meditationBellViewModel =
            MeditationBellViewModel(
                mockMindBellAlarmManager,
                mockPendingAlarmIntent
            )
    }

    @Test
    fun verifyThatBellIsPlaying() {
        // act
        meditationBellViewModel.startMeditation()
        // assert
        verify {
            mockMindBellAlarmManager.setRepeating(
                AlarmManager.ELAPSED_REALTIME_WAKEUP,
                any(),
                1000L * 60L,
                mockPendingAlarmIntent
            )
        }
    }
}
