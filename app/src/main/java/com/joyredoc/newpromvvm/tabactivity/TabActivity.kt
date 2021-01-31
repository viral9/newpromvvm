package com.joyredoc.newpromvvm.tabactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.joyredoc.newpromvvm.R
import com.joyredoc.newpromvvm.databinding.ActivityTabBinding

class TabActivity : AppCompatActivity() {

    private val binding: ActivityTabBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_tab) as ActivityTabBinding
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab)
        binding.activity = this

        val homeFragment = HomeFragment()
        val mapFragment = MapFragment()
        val profileFragment = ProfileFragment()

        makeCurrentFragment(homeFragment)

        binding.apply {

            bnvTab.setOnNavigationItemSelectedListener {

                when(it.itemId)
                {
                    R.id.home -> makeCurrentFragment(homeFragment)
                    R.id.map -> makeCurrentFragment(mapFragment)
                    R.id.profile -> makeCurrentFragment(profileFragment)
                }

                true

            }

        }



    }

    private fun makeCurrentFragment(homeFragment: Fragment) {

        supportFragmentManager.beginTransaction().apply {

            replace(R.id.fl_tab,homeFragment)
            commit()

        }

    }
}