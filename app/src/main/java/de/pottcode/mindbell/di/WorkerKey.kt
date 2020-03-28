package de.pottcode.mindbell.di

import androidx.work.ListenableWorker
import dagger.MapKey
import kotlin.reflect.KClass

/**
 * (c) Dimitri Simon on 2020-03-19
 */
@MapKey
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class WorkerKey(val value: KClass<out ListenableWorker>)
