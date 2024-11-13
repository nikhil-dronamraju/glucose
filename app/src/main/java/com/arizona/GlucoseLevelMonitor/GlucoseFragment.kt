package com.arizona.GlucoseLevelMonitor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arizona.GlucoseLevelMonitor.databinding.FragmentGlucoseBinding

class GlucoseFragment : Fragment() {
    private lateinit var glucose: Glucose
    private lateinit var binding: FragmentGlucoseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGlucoseBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        Nothing needs to happen here:
    }
}