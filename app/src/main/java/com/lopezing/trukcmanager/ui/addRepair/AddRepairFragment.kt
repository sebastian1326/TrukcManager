package com.lopezing.trukcmanager.ui.addRepair

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.lopezing.trukcmanager.databinding.FragmentAddRepairBinding

class AddRepairFragment : Fragment() {
    private var _binding: FragmentAddRepairBinding? = null

    private val binding get() = _binding!!

    companion object {
        fun newInstance() = AddRepairFragment()
    }

    private lateinit var viewModel: AddRepairViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {val addRepairViewModel =
        ViewModelProvider(this).get(AddRepairViewModel::class.java)

        _binding = FragmentAddRepairBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textRepair
        addRepairViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AddRepairViewModel::class.java)
        // TODO: Use the ViewModel
    }

}