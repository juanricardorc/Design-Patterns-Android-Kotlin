package com.juanricardorc.designpatterns.mainmenu

import android.content.Intent
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.juanricardorc.abstract_factory.AbstractFactoryActivity
import com.juanricardorc.designpatterns.R

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupBottomNavigationView()
        setupNavigation()
    }

    private fun setupBottomNavigationView() {
        bottomNavigationView = findViewById(R.id.nav_view)
    }

    private fun setupNavigation() {
        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home,
                R.id.navigation_dashboard,
                R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        bottomNavigationView.setupWithNavController(navController)
    }

    override fun onResume() {
        super.onResume()

        /* var intent = Intent(baseContext, FactoryMethodActivity::class.java)
         startActivity(intent)*/

       /* var intent = Intent(baseContext, AbstractFactoryActivity::class.java)
        startActivity(intent)*/
    }
}
