package com.lopezing.trukcmanager.ui.Services

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.lopezing.trukcmanager.databinding.FragmentServicesBinding

class ServicesFragment : Fragment() {

    companion object {
        fun newInstance() = ServicesFragment()
    }
    private var _binding: FragmentServicesBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: ServicesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {val servicesViewModel =
        ViewModelProvider(this).get(ServicesViewModel::class.java)

        _binding = FragmentServicesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textServices
        servicesViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ServicesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}