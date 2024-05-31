package com.iesam.ex_22_23_psp_marzo.presentation

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.iesam.ex_22_23_psp_marzo.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        setupView()
        initExercise2()
    }

    private fun setupView() {
        findViewById<Button>(R.id.action_close).setOnClickListener {
            finish()
        }
    }

    private fun initExercise2() {
        GlobalScope.launch {
            while (true){
                delay(2000)
                Log.d("ex2", "running")
            }
        }

    }
}