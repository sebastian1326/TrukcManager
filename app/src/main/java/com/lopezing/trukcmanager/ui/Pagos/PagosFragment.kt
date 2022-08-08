package com.lopezing.trukcmanager.ui.Pagos

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.lopezing.trukcmanager.databinding.FragmentPagosBinding

class PagosFragment : Fragment() {


    //private lateinit var viewModel: PagosViewModel
    private var _binding: FragmentPagosBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val pagosViewModel =
            ViewModelProvider(this).get(PagosViewModel::class.java)

        _binding = FragmentPagosBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textPresent
        pagosViewModel.text.observe(viewLifecycleOwner) {
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