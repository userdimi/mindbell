package de.pottcode.mindbell.schedule

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

/**
 * (c) Dimitri Simon on 2020-03-16
 */
class MindBellWorker(
    applicationContext: Context,
    workerParameter: WorkerParameters
) : Worker(applicationContext, workerParameter) {
    override fun doWork(): Result {
        TODO("Not yet implemented")
    }
}
