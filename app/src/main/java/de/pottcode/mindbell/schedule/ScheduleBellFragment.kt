package de.pottcode.mindbell.schedule

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import de.pottcode.mindbell.MindBellApplication
import de.pottcode.mindbell.R
import javax.inject.Inject

class ScheduleBellFragment : Fragment() {

    @Inject
    lateinit var viewModel: ScheduleViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (requireActivity().application as MindBellApplication).appComponent.inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.schedule_fragment, container, false)
    }

    companion object {
        fun newInstance() = ScheduleBellFragment()
    }
}
