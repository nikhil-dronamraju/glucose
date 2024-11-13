package com.arizona.GlucoseLevelMonitor

import androidx.lifecycle.ViewModel
import java.util.*

class GlucoseRecyclerViewViewModel : ViewModel() {
    val glucoses = mutableListOf<Glucose>()
    val calendar = GregorianCalendar(Calendar.getInstance().get(Calendar.YEAR),
        Calendar.getInstance().get(Calendar.MONTH),
        Calendar.getInstance().get(Calendar.DAY_OF_MONTH))

    init {
        for (i in 0..99) {
            val glucoseObject = Glucose(calendar.time, (60..180).random(), (60..180).random(), (60..180).random(), (60..180).random())
            calendar.add(Calendar.DATE, -1)
            glucoses.add(glucoseObject)
        }
    }

}