package de.pottcode.mindbell.di

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import de.pottcode.mindbell.schedule.worker.ChildWorkerFactory
import de.pottcode.mindbell.schedule.worker.MindBellWorker

/**
 * (c) Dimitri Simon on 2020-03-19
 */
@Module
interface WorkerBindingModule {
    @Binds
    @IntoMap
    @WorkerKey(MindBellWorker::class)
    fun bindMindBellWorker(factory: MindBellWorker.Factory): ChildWorkerFactory
}
