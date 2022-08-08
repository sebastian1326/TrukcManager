package com.lopezing.trukcmanager.ui.Main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.navigation.Navigation
import androidx.navigation.findNavController


import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.lopezing.trukcmanager.R
import com.lopezing.trukcmanager.databinding.ActivityMainBinding
import com.lopezing.trukcmanager.databinding.FragmentIngresarBinding
import com.lopezing.trukcmanager.ui.Splash.SplashFragment
import com.lopezing.trukcmanager.ui.ingresar.ingresarFragment
//import com.lopezing.trukcmanager.ui.ingresar.ingresarFragmentDirections
import java.util.*
import kotlin.concurrent.timerTask
//private lateinit var mainBinding: ActivityMainBinding
private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_principal, R.id.navigation_gastos, R.id.navigation_historial,R.id.navigation_ganancias
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        //val fragmentManager=supportFragmentManager
        //val fragmentTransaction=fragmentManager.beginTransaction()
        //val splashFragment=SplashFragment()
        //fragmentTransaction.add(R.id.fragmentContainerView2,splashFragment).commit()
        //val timer= Timer()
        //timer.schedule(
        //    timerTask {
       //         ingresarBinding.
        //    },2000
        //)

    }

    //private fun goToFragmentin() {
        //ingresarFragment
        /*val fragmentManager=supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        val fragmentinicio=ingresarFragment()
        fragmentTransaction.replace(R.id.fragmentContainerView2,fragmentinicio).commit()
*/      //Navigation.findNavController(this,R.id.fragmentContainerV).navigate(R.id.action_splashFragment_to_ingresarFragment)
   // }
    //override fun OnCreateOptionMenu(menu: Menu):Boolean{
        //menuInflater.inflate(R.menu.,menu)
      //  return true
    //}
}