package com.lopezing.trukcmanager.ui.principal

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.lopezing.trukcmanager.databinding.FragmentPrincipalBinding

class PrincipalFragment : Fragment() {

    private var _binding: FragmentPrincipalBinding? = null

    private val binding get() = _binding!!
    //private lateinit var viewModel: PrincipalViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {val principalViewModel =
        ViewModelProvider(this).get(PrincipalViewModel::class.java)

        _binding = FragmentPrincipalBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textView2
        principalViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    /*override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PrincipalViewModel::class.java)
        // TODO: Use the ViewModel
    }*/

}