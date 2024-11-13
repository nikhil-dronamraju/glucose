package com.arizona.GlucoseLevelMonitor

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

private const val TAG = "GlucoseRecyclerView"
class GlucoseRecyclerView : Fragment() {

    private val viewModel: GlucoseRecyclerViewViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_glucose_recycler_view, container, false)
    }
}