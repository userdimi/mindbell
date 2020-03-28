package de.pottcode.mindbell.schedule

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import de.pottcode.mindbell.MindBellApplication
import de.pottcode.mindbell.R
import de.pottcode.mindbell.databinding.ScheduleBellFragmentBinding
import javax.inject.Inject

class ScheduleBellFragment : Fragment() {

    @Inject
    lateinit var viewModel: ScheduleViewModel
    lateinit var binding: ScheduleBellFragmentBinding

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (requireActivity().application as MindBellApplication).appComponent.inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.schedule_bell_fragment, container, false)
        binding.viewModel = this.viewModel
        return binding.root
    }

    companion object {
        fun newInstance() = ScheduleBellFragment()
    }
}
