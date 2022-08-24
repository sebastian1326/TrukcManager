package com.lopezing.trukcmanager.ui.Main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.navigation.findNavController


import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.lopezing.trukcmanager.R
import com.lopezing.trukcmanager.databinding.ActivityMainBinding
import com.lopezing.trukcmanager.ui.addRepair.AddRepairFragment
import com.lopezing.trukcmanager.ui.ingresar.ingresarFragment
import com.lopezing.trukcmanager.ui.principal.PrincipalFragment
//import com.lopezing.trukcmanager.ui.ingresar.ingresarFragmentDirections

private var bandera:Boolean=false
private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    fun actionNavGrap(band:Boolean){
    //    if (band) navView.visibility = View.GONE
    //    else navView.visibility = View.VISIBLE
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_TrukcManager)
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //supportActionBar?.hide()
        //val actionbar = supportActionBar
        //actionbar?.setDisplayHomeAsUpEnabled(true)
        // calling the action bar
        // This callback will only be called when MyFragment is at least Started.



        val navView: BottomNavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        navController.addOnDestinationChangedListener { _, destination, _ ->
            if (destination.id == R.id.userInFragment || destination.id == R.id.ingresarFragment){
                navView.visibility = View.GONE
                }
            else {
                //setTheme(R.style.Theme_TrukcManager)
                //supportActionBar?.show()

                navView.visibility = View.VISIBLE

            }
        }

        // Passing each menu ID as a set of Ids because each   13.25
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_principal,
                R.id.navigation_gastos,
                R.id.navigation_viajes,
                R.id.navigation_mantenimiento,
                R.id.navigation_services
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)



    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater=menuInflater
        inflater.inflate(R.menu.menu_aux,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val fragmentManager=supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        val fragmentPrincipal=PrincipalFragment ()
        val fragmentAddClient=AddRepairFragment()
        val navView: BottomNavigationView = binding.navView
        when(item.itemId){
            R.id.navigation_addviaje->{
                fragmentTransaction.replace(R.id.container_principal,fragmentPrincipal).commit()
                navView.visibility = View.VISIBLE
            }
//            R.id.navigation_addcliente->{
//                fragmentTransaction.replace(R.id.container_principal,fragmentAddClient).commit()
//                navView.visibility = View.GONE
//            }
            R.id.action_search->fragmentTransaction.replace(R.id.container_principal,fragmentAddClient).commit()
        }
        return super.onOptionsItemSelected(item)
    }
    /*override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onContextItemSelected(item)
    }*/

    private fun navegarmenu(navigationAddcliente: Int) {
        val fragmentManager=supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        val fragmentinicio=ingresarFragment()
}


//TODO:1 '2 25" // 8/8
}