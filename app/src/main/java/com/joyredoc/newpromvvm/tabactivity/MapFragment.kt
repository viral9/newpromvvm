package com.joyredoc.newpromvvm.tabactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.joyredoc.newpromvvm.R
import com.joyredoc.newpromvvm.databinding.FragmentHomeBinding
import com.joyredoc.newpromvvm.databinding.FragmentMapBinding


class MapFragment : Fragment() {


    private lateinit var  binding : FragmentMapBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_map,
            container,
            false
        ) as FragmentMapBinding

        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



    }

}