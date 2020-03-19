package de.pottcode.mindbell.di

import android.content.Context
import android.media.AudioAttributes
import android.media.MediaPlayer
import dagger.Module
import dagger.Provides
import de.pottcode.mindbell.R
import javax.inject.Singleton

/**
 * (c) Dimitri Simon on 2020-03-18
 */
@Module
class MediaPlayerModule {

    @Singleton
    @Provides
    fun providesMediaPlayed(context: Context): MediaPlayer {
        return MediaPlayer.create(context, R.raw.mind_bell)
    }

    @Provides
    fun providesAudioAttributes(): AudioAttributes {
        return AudioAttributes.Builder().apply {
            setUsage(AudioAttributes.USAGE_NOTIFICATION_EVENT)
            setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
        }.build()
    }
}
