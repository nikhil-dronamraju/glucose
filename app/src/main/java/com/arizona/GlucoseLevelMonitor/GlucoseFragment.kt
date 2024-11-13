package com.arizona.GlucoseLevelMonitor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import java.util.*
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
        binding.apply{
            saveDate.setText(Date().toString())
            clear.setOnClickListener{ view: View ->
                inputFasting.setText("")
                inputBreakfast.setText("")
                inputLunch.setText("")
                inputDinner.setText("")
                viewFastingFragment.setText("")
                viewDateFragment.setText("")
                viewLunchFragment.setText("")
                viewBreakfastFragment.setText("")
                viewDinnerFragment.setText("")
            }
            saveDate.setOnClickListener{ view: View ->
                viewDateFragment.setText(Date().toString())
                viewFastingFragment.setText(getGlucoseText(inputFasting.text.toString()))
                viewBreakfastFragment.setText(getGlucoseText(inputBreakfast.text.toString()))
                viewLunchFragment.setText(getGlucoseText(inputLunch.text.toString()))
                viewDinnerFragment.setText(getGlucoseText(inputDinner.text.toString()))
            }
        }
    }

    private fun getGlucoseText( textVal: String ): String {
        val glucoseNumber = textVal.toIntOrNull()
        if ( glucoseNumber != null){
            if (glucoseNumber < 70 ){
                return "Hypoglycemic"
            } else if (glucoseNumber <= 99){
                return "Normal"
            } else {
                return "Abnormal"
            }
        } else {
            return "Invalid val."
        }
    }
}