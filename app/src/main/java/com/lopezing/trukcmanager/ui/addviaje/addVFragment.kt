package com.lopezing.trukcmanager.ui.addviaje

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lopezing.trukcmanager.R

class addVFragment : Fragment() {

    companion object {
        fun newInstance() = addVFragment()
    }

    private lateinit var viewModel: AddVViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_add_v, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AddVViewModel::class.java)
        // TODO: Use the ViewModel
    }

}