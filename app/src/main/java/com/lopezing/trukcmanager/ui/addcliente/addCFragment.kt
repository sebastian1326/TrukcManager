package com.lopezing.trukcmanager.ui.addcliente

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lopezing.trukcmanager.R

class addCFragment : Fragment() {

    companion object {
        fun newInstance() = addCFragment()
    }

    private lateinit var viewModel: AddCViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_add_c, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AddCViewModel::class.java)
        // TODO: Use the ViewModel
    }

}