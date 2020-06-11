package de.pottcode.mindbell.schedule.view

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import de.pottcode.mindbell.MindBellApplication
import de.pottcode.mindbell.R
import de.pottcode.mindbell.databinding.ScheduleBellFragmentBinding

class ScheduleBellFragment : Fragment() {

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
        binding.fragment = this
        return binding.root
    }

    fun showTimePickerDialog() {
        findNavController().navigate(R.id.action_scheduleFragment_to_MindBellTimePickerDialog)
    }

    companion object {
        fun newInstance() =
            ScheduleBellFragment()
    }
}
