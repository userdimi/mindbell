package de.pottcode.mindbell.player

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import de.pottcode.mindbell.MindBellApplication
import de.pottcode.mindbell.R
import de.pottcode.mindbell.databinding.MindBellPlayerFragmentBinding
import javax.inject.Inject

class MindBellPlayerFragment : Fragment() {

    @Inject
    lateinit var viewModel: MindBellPlayerViewModel

    lateinit var binding: MindBellPlayerFragmentBinding

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
            DataBindingUtil.inflate(inflater, R.layout.mind_bell_player_fragment, container, false)
        binding.mindBellPlayerViewModel = viewModel
        return binding.root
    }

    companion object {
        fun newInstance() = MindBellPlayerFragment()
    }
}
