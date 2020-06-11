package de.pottcode.mindbell.schedule.view

import android.app.Dialog
import android.app.TimePickerDialog
import android.content.Context
import android.os.Bundle
import android.text.format.DateFormat.is24HourFormat
import android.widget.TimePicker
import androidx.fragment.app.DialogFragment
import de.pottcode.mindbell.MindBellApplication
import timber.log.Timber
import java.util.Calendar
import javax.inject.Inject

/**
 * (c) Dimitri Simon on 04.04.20
 */

class MindBellTimePickerDialog : DialogFragment(), TimePickerDialog.OnTimeSetListener {

    @Inject
    lateinit var viewModel: MindBellTimerPickerDialogViewModel

    private val calendar by lazy { Calendar.getInstance() }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (requireActivity().application as MindBellApplication).appComponent.inject(this)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        // Use the current time as the default values for the picker
        val hour = calendar.get(Calendar.HOUR_OF_DAY)
        val minute = calendar.get(Calendar.MINUTE)

        return TimePickerDialog(activity, this, hour, minute, is24HourFormat(activity))
    }

    override fun onTimeSet(timePicker: TimePicker?, hour: Int, minute: Int) {
        calendar.set(Calendar.HOUR_OF_DAY, hour)
        calendar.set(Calendar.MINUTE, minute)
        viewModel.scheduleBell(calendar.timeInMillis)
        Timber.d("Timepicker $hour: hours and $minute minutes are set")
    }
}
