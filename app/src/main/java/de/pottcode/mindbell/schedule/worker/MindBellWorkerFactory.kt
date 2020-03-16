package de.pottcode.mindbell.schedule.worker

import android.content.Context
import androidx.work.ListenableWorker
import androidx.work.WorkerParameters

/**
 * (c) Dimitri Simon on 2020-03-16
 */
interface MindBellWorkerFactory {
    fun create(applicationContext: Context, workerParameters: WorkerParameters): ListenableWorker
}
