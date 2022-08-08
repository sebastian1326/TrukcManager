package com.lopezing.trukcmanager.ui.cuentas_t

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lopezing.trukcmanager.R

class cuentasTotFragment : Fragment() {

    companion object {
        fun newInstance() = cuentasTotFragment()
    }

    private lateinit var viewModel: CuentasTotViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cuentas_tot, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CuentasTotViewModel::class.java)
        // TODO: Use the ViewModel
    }

}