package de.pottcode.mindbell

import android.content.Context
import androidx.fragment.app.testing.FragmentScenario
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.filters.LargeTest
import de.pottcode.mindbell.player.MindBellPlayerFragment
import org.junit.Before
import org.junit.Test

/**
 * (c) Dimitri Simon on 2020-03-17
 */

@LargeTest
class MindBellPlayerFragmentTest {

    private lateinit var fragmentScenario: FragmentScenario<MindBellPlayerFragment>
    private val context = ApplicationProvider.getApplicationContext<Context>()

    @Before
    fun setUp() {
        fragmentScenario = launchFragmentInContainer(null, R.style.AppTheme)
    }

    @Test
    fun testMindBellPlayerFragment() {
        onView(withId(R.id.button_play_bell)).check(matches(isDisplayed()))
        onView(withId(R.id.button_play_bell)).check(matches(withText("Play")))
    }
}
