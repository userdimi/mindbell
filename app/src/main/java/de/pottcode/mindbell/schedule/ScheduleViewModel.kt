package de.pottcode.mindbell.schedule

import androidx.lifecycle.ViewModel
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager
import javax.inject.Inject

class ScheduleViewModel @Inject constructor(
    private val workManager: WorkManager,
    private val oneTimeWorkRequest: OneTimeWorkRequest
) : ViewModel() {

    fun scheduleBell() {
        workManager.enqueue(oneTimeWorkRequest)
    }
}
