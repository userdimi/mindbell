package de.pottcode.mindbell

import android.content.Context
import androidx.fragment.app.testing.FragmentScenario
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.core.app.ApplicationProvider
import androidx.test.filters.LargeTest
import de.pottcode.mindbell.meditation.MeditationBellFragment
import org.junit.Before

/**
 * (c) Dimitri Simon on 2020-03-17
 */

@LargeTest
class MeditationBellFragmentTest {

    private lateinit var fragmentScenario: FragmentScenario<MeditationBellFragment>
    private val context = ApplicationProvider.getApplicationContext<Context>()

    @Before
    fun setUp() {
        fragmentScenario = launchFragmentInContainer(null, R.style.AppTheme)
    }
}
