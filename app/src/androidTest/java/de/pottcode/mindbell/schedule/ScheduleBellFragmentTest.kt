package de.pottcode.mindbell.schedule

import androidx.fragment.app.testing.launchFragment
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import de.pottcode.mindbell.R
import de.pottcode.mindbell.schedule.view.ScheduleBellFragment
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

/**
 * (c) Dimitri Simon on 04.04.20
 */
@LargeTest
@RunWith(AndroidJUnit4::class)
class ScheduleBellFragmentTest {

    @Before
    fun setUp() {
        launchFragment<ScheduleBellFragment>(null, R.style.AppTheme)
    }

    @Test
    fun testScheduleBellFragment() {
        testBeginBellIntervalBehavior()
    }

    private fun testBeginBellIntervalBehavior() {
        checkThatTimePickerIsDisplayedOnClick()
    }

    private fun checkThatTimePickerIsDisplayedOnClick() {
        onView(withId(R.id.text_input_edit_text_schedule_time_start)).perform(click())
    }
}
