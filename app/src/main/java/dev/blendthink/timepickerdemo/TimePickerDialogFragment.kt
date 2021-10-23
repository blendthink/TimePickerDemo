package dev.blendthink.timepickerdemo

import android.app.Dialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.util.Log
import android.widget.TimePicker
import androidx.fragment.app.DialogFragment
import java.util.*

class TimePickerDialogFragment : DialogFragment(), TimePickerDialog.OnTimeSetListener {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val c = Calendar.getInstance()
        val hour = c[Calendar.HOUR_OF_DAY]
        val minute = c[Calendar.MINUTE]
        return TimePickerDialog(requireContext(), this, hour, minute, true)
    }

    override fun onTimeSet(view: TimePicker, hourOfDay: Int, minute: Int) {
        Log.d("onTimeSet", "hourOfDay: $hourOfDay, minute: $minute")
    }

    companion object {
        const val TAG = "time_picker"
    }
}
