package com.joyredoc.newpromvvm.tabactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.joyredoc.newpromvvm.R
import com.joyredoc.newpromvvm.databinding.FragmentMapBinding
import com.joyredoc.newpromvvm.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {


    private lateinit var  binding : FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_profile,
            container,
            false
        ) as FragmentProfileBinding

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



    }


}