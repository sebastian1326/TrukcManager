package com.lopezing.trukcmanager.ui.userin

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.lopezing.trukcmanager.R
import com.lopezing.trukcmanager.databinding.ActivityMainBinding
import com.lopezing.trukcmanager.databinding.FragmentUserInBinding

class UserInFragment : Fragment() {


    private lateinit var UserInViewModel: UserInViewModel
    private lateinit var userInBinding: FragmentUserInBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        userInBinding = FragmentUserInBinding.inflate(inflater,container,false)
        UserInViewModel = ViewModelProvider(this).get(UserInViewModel::class.java)
        return userInBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onResume() {
        super.onResume()
        (activity as AppCompatActivity).supportActionBar!!.hide()
    }


}