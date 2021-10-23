package dev.blendthink.timepickerdemo

import android.app.TimePickerDialog.OnTimeSetListener
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.TimePicker
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), OnTimeSetListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button_show_dialog) ?: return
        button.setOnClickListener {
            TimePickerDialogFragment().show(supportFragmentManager, TimePickerDialogFragment.TAG)
        }
    }

    override fun onTimeSet(view: TimePicker, hourOfDay: Int, minute: Int) {
        val textView = findViewById<TextView>(R.id.time_text) ?: return
        textView.text = "hourOfDay: $hourOfDay, minute: $minute"
    }
}