package com.lopezing.trukcmanager.ui.ingresar

//import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
//import androidx.navigation.Navigation
//import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
//import com.lopezing.trukcmanager.R
import com.lopezing.trukcmanager.databinding.FragmentIngresarBinding
//import com.lopezing.trukcmanager.ui.Splash.SplashFragment

class ingresarFragment : Fragment() {

    //companion object {
    //    fun newInstance() = ingresarFragment()
    //}

    private lateinit var ingresarViewModel: IngresarViewModel
    private lateinit var ingresarBinding: FragmentIngresarBinding

    override fun onCreateView(
        inflater: LayoutInflater, conteiner: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        ingresarViewModel = ViewModelProvider(this).get(IngresarViewModel::class.java)
        ingresarBinding=FragmentIngresarBinding.inflate(inflater,conteiner,false)
        ingresarViewModel.msgError.observe(viewLifecycleOwner){ msg->
            showErrormsg(msg)
        }
        ingresarViewModel.registerSuccess.observe(viewLifecycleOwner){ user->
            showErrormsg("Usuario, creado")

            InLoad()
        }
        val view=ingresarBinding.root
        with(ingresarBinding){
            textNewU.setOnClickListener{
                //    Navigation.findNavController(this,R.id.container).navigate(R.id.userInFragment)
                //    findNavController().navigate(ingresarFragmentDirection)
                findNavController().navigate(ingresarFragmentDirections.actionIngresarFragmentToUserInFragment2())

            }
            button.setOnClickListener{
                ingresarViewModel.inLoadingUser(intextEmail.text.toString(),intextPass.text.toString())
                //    Navigation.findNavController(this,R.id.container).navigate(R.id.userInFragment)
                //    findNavController().navigate(ingresarFragmentDirection)


            }

        }

        //fun splashCamb(){
            //findNavController().navigate(ingresarFragmentDirections.actionIngresarFragmentToUserInFragment())
        //}
    return view
    //return ingresarBinding.root
    }
    override fun onResume() {
        super.onResume()
        (activity as AppCompatActivity).supportActionBar!!.hide()
    }
    fun InLoad(){
        findNavController().navigate(ingresarFragmentDirections.actionIngresarFragmentToPrincipalFragment())
    }
    private fun showErrormsg(msg: String?) {
        Toast.makeText(requireActivity(),msg, Toast.LENGTH_LONG).show()
    }

    /*override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(IngresarViewModel::class.java)

        // TODO: Use the ViewModel

    }*/

}