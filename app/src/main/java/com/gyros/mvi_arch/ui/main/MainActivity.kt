package com.gyros.mvi_arch.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gyros.mvi_arch.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMainFragment()
    }

    /**
     * This is because is just one fragment, besides it's a simple app
     * normally I'd do this with navigation component, which is more powerfull
     */
    fun showMainFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, MainFragment(), "Main Fragment")
    }
}
