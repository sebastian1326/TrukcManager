package com.lopezing.trukcmanager.ui.ingresar

//import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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

    //private lateinit var viewModel: IngresarViewModel
    private lateinit var ingresarBinding: FragmentIngresarBinding

    override fun onCreateView(
        inflater: LayoutInflater, conteiner: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        ingresarBinding=FragmentIngresarBinding.inflate(inflater,conteiner,false)
        val view=ingresarBinding.root
        ingresarBinding.buttonNew.setOnClickListener{
        //    Navigation.findNavController(this,R.id.container).navigate(R.id.userInFragment)
        //    findNavController().navigate(ingresarFragmentDirection)
            findNavController().navigate(ingresarFragmentDirections.actionIngresarFragmentToUserInFragment2())

        }
        //fun splashCamb(){
            //findNavController().navigate(ingresarFragmentDirections.actionIngresarFragmentToUserInFragment())
        //}
        return view
    }

    /*override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(IngresarViewModel::class.java)

        // TODO: Use the ViewModel

    }*/

}