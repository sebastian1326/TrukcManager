package com.lopezing.trukcmanager.ui.Viajes

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.lopezing.trukcmanager.databinding.FragmentViajesBinding

class ViajesFragment : Fragment() {


    //private lateinit var viewModel: PagosViewModel
    private var _binding: FragmentViajesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viajesViewModel =
            ViewModelProvider(this).get(ViajesViewModel::class.java)

        _binding = FragmentViajesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textPresent
        viajesViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    /*override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PagosViewModel::class.java)
        // TODO: Use the ViewModel
    }*/

}