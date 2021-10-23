package dev.blendthink.timepickerdemo

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button_show_dialog) ?: return
        button.setOnClickListener {
            TimePickerDialogFragment().show(supportFragmentManager, TimePickerDialogFragment.TAG)
        }
    }
}