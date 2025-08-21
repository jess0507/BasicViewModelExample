package com.id.basicviewmodelexample

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.viewModels

class MainActivity : ComponentActivity() {
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.tv_count)
        viewModel.count.observe(this) { value ->
            textView.text = value.toString()
        }


        findViewById<TextView>(R.id.btn_increment).setOnClickListener {
            viewModel.increment()
        }
    }
}
