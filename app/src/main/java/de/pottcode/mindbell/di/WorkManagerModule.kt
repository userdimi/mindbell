package de.pottcode.mindbell.di

import android.content.Context
import androidx.work.OneTimeWorkRequest
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import dagger.Module
import dagger.Provides
import de.pottcode.mindbell.schedule.worker.MindBellWorker
import javax.inject.Singleton

/**
 * (c) Dimitri Simon on 27.03.20
 */
@Module
class WorkManagerModule {

    @Singleton
    @Provides
    fun providesWorkManager(context: Context): WorkManager = WorkManager.getInstance(context)

    @Provides
    fun providesOneTimeWorkRequest(): OneTimeWorkRequest =
        OneTimeWorkRequestBuilder<MindBellWorker>().build()
}
