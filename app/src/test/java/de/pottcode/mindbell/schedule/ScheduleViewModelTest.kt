package de.pottcode.mindbell.schedule

import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager
import de.pottcode.mindbell.schedule.view.MindBellTimerPickerDialogViewModel
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.MockK
import io.mockk.verify
import org.junit.Before
import org.junit.Ignore
import org.junit.Test

/**
 * (c) Dimitri Simon on 26.03.20
 */
@Ignore ("Test will be rewritten by full implementation of the feature")
class ScheduleViewModelTest {

    private lateinit var scheduleViewModel: MindBellTimerPickerDialogViewModel

    @MockK
    private lateinit var mockWorkManager: WorkManager

    @MockK
    private lateinit var mockRequest: OneTimeWorkRequest

    @Before
    fun setUp() {
        MockKAnnotations.init(this, relaxed = true)
    }

    @Test
    fun verifyWorkerIsScheduled() {
        // act
        //scheduleViewModel.scheduleBell()

        // assert
        verify { mockWorkManager.enqueue(mockRequest) }
    }
}
