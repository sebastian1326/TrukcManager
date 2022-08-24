package com.lopezing.trukcmanager.ui.Gastos

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.lopezing.trukcmanager.databinding.FragmentGastosBinding

class GastosFragment : Fragment() {

    private var _binding: FragmentGastosBinding? = null

    private val binding get() = _binding!!
    private lateinit var viewModel: GastosViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val gastosViewModel =
            ViewModelProvider(this).get(GastosViewModel::class.java)

        _binding = FragmentGastosBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textPresent
        gastosViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(GastosViewModel::class.java)
        // TODO: Use the ViewModel
    }

}