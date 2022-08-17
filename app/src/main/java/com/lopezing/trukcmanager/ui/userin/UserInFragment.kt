package com.lopezing.trukcmanager.ui.userin

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import com.lopezing.trukcmanager.databinding.FragmentUserInBinding

class UserInFragment : Fragment() {
    private lateinit var userInViewModel: UserInViewModel
    private lateinit var userInBinding: FragmentUserInBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        userInViewModel = ViewModelProvider(this).get(UserInViewModel::class.java)
        userInBinding = FragmentUserInBinding.inflate(inflater,container,false)
        userInViewModel.msgError.observe(viewLifecycleOwner){ msg->
            showErrormsg(msg)
        }
        userInViewModel.registerSuccess.observe(viewLifecycleOwner){ user->
            showErrormsg("Usuario, registrado")
            with(userInBinding){
                userInViewModel.createUser(user,nameText.text.toString(),emailText.text.toString(),cellText.text.toString(),placaText.text.toString())
            }
            inIngresar()
        }
        val view=userInBinding.root

        with(userInBinding) {
            registerButton.setOnClickListener {
                userInViewModel.checkIn(emailText.text.toString(),passText.text.toString(),cpassText.text.toString(),nameText.text.toString(),cellText.text.toString(),placaText.text.toString())
        }
        }
        return userInBinding.root
    }
    private fun showErrormsg(msg: String?) {
        Toast.makeText(requireActivity(),msg,Toast.LENGTH_LONG).show()
    }

    /*override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        // TODO: Use the ViewModel
    }*/
    fun inIngresar(){
        findNavController().navigate(UserInFragmentDirections.actionUserInFragmentToIngresarFragment())
    }
    override fun onResume() {
        super.onResume()
        (activity as AppCompatActivity).supportActionBar!!.hide()
    }
}