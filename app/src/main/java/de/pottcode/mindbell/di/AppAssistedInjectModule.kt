package de.pottcode.mindbell.di

import com.squareup.inject.assisted.dagger2.AssistedModule
import dagger.Module

/**
 * (c) Dimitri Simon on 2020-03-19
 */

@Module(includes = [AssistedInject_AppAssistedInjectModule::class])
@AssistedModule
abstract class AppAssistedInjectModule
