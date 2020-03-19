package de.pottcode.mindbell.schedule.worker

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.squareup.inject.assisted.Assisted
import com.squareup.inject.assisted.AssistedInject

/**
 * (c) Dimitri Simon on 2020-03-19
 */

class MindBellWorker @AssistedInject constructor(
    @Assisted private val appContext: Context,
    @Assisted private val params: WorkerParameters
) : Worker(appContext, params) {
    override fun doWork(): Result {
        return Result.success()
    }

    @AssistedInject.Factory
    interface Factory : ChildWorkerFactory

    companion object {
        private const val TAG = "MindBellWorker"
    }
}
