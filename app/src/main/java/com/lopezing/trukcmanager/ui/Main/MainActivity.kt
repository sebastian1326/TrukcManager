package com.lopezing.trukcmanager.ui.Main

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.widget.ToolbarWidgetWrapper
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.Navigation
import androidx.navigation.findNavController


import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import com.lopezing.trukcmanager.R
import com.lopezing.trukcmanager.databinding.ActivityMainBinding

import com.lopezing.trukcmanager.databinding.FragmentIngresarBinding
import com.lopezing.trukcmanager.ui.Splash.SplashFragment
import com.lopezing.trukcmanager.ui.addcliente.addCFragment
import com.lopezing.trukcmanager.ui.ingresar.ingresarFragment
import com.lopezing.trukcmanager.ui.ingresar.ingresarFragmentDirections
//import com.lopezing.trukcmanager.ui.ingresar.ingresarFragmentDirections
import java.util.*
import kotlin.concurrent.timerTask
//private lateinit var mainBinding: ActivityMainBinding
private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_TrukcManager)
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        /*val timer= Timer()
        timer.schedule(
            timerTask {
                setTheme(R.style.Theme_TrukcManager)
            },1000
        )*/
        //val navView2: Toolbar = binding.toolbar
        val navView: BottomNavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        navController.addOnDestinationChangedListener { _, destination, _ ->
            if (destination.id == R.id.userInFragment || destination.id == R.id.ingresarFragment)
                navView.visibility = View.GONE
            else
                navView.visibility = View.VISIBLE
        }
        // Passing each menu ID as a set of Ids because each   13.25
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_principal,
                R.id.navigation_gastos,
                R.id.navigation_historial,
                R.id.navigation_ganancias
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        // Passing each menu ID as a set of Ids because each   13.25
        // menu should be considered as top level destinations.

        //   R.id.navigation_addcliente, R.id.navigation_addviaje, R.id.navigation_ganancias,R.id.navigation_mantenimiento

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



    /*override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val fragmentManager=supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        val fragmentaddc=addCFragment()

        when(item.itemId){

            R.id.navigation_addcliente->fragmentTransaction.replace(R.id.container_principal, fragmentaddc).commit()
            R.id.navigation_addviaje->fragmentTransaction.replace(R.id.container_principal, fragmentaddc).commit()

        }
        drawer.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        toggle.syncState()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        toggle.onConfigurationChanged(newConfig)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item))
            return true
        return super.onOptionsItemSelected(item)
    }*/

    //private fun goToFragmentin() {
        //ingresarFragment
        /*val fragmentManager=supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        val fragmentinicio=ingresarFragment()
        fragmentTransaction.replace(R.id.fragmentContainerView2,fragmentinicio).commit()
*/      //Navigation.findNavController(this,R.id.fragmentContainerV).navigate(R.id.action_splashFragment_to_ingresarFragment)
   // }
   // override fun OnCreateOptionMenu(menu: Menu):Boolean{
   //     menuInflater.inflate(R.menu.,menu)
    //    return true
    //}TODO: 26''
}