package com.lopezing.trukcmanager.ui.Mantenimiento

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.lopezing.trukcmanager.databinding.FragmentHistoryBinding

class MantenimientoFragment : Fragment() {

    private var _binding: FragmentHistoryBinding? = null
    private val binding get() = _binding!!
    //private lateinit var viewModel: HistoryViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val historyViewModel =
            ViewModelProvider(this).get(MantenimientoViewModel::class.java)

        _binding = FragmentHistoryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textPresent
        historyViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    /*override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HistoryViewModel::class.java)
        // TODO: Use the ViewModel
    }*/

}