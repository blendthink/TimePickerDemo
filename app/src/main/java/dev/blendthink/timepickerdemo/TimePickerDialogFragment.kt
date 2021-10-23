package dev.blendthink.timepickerdemo

import android.app.Dialog
import android.app.TimePickerDialog
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import java.util.*

class TimePickerDialogFragment : DialogFragment() {

    private lateinit var listener: TimePickerDialog.OnTimeSetListener

    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            listener = context as TimePickerDialog.OnTimeSetListener
        } catch (e: ClassCastException) {
            throw ClassCastException(
                (context.toString() +
                        " must implement TimePickerDialog.OnTimeSetListener")
            )
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val c = Calendar.getInstance()
        val hour = c[Calendar.HOUR_OF_DAY]
        val minute = c[Calendar.MINUTE]
        return TimePickerDialog(requireContext(), listener, hour, minute, true)
    }

    companion object {
        const val TAG = "time_picker"
    }
}
