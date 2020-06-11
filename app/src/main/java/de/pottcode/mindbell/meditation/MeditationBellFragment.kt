package de.pottcode.mindbell.meditation

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import de.pottcode.mindbell.MindBellApplication
import de.pottcode.mindbell.R
import de.pottcode.mindbell.databinding.MeditationBellFragmentBinding
import javax.inject.Inject

class MeditationBellFragment : Fragment() {

    @Inject
    lateinit var viewModel: MeditationBellViewModel

    lateinit var binding: MeditationBellFragmentBinding

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
            DataBindingUtil.inflate(inflater, R.layout.meditation_bell_fragment, container, false)
        binding.mindBellPlayerViewModel = viewModel
        return binding.root
    }

    companion object {
        fun newInstance() =
            MeditationBellFragment()
    }
}
