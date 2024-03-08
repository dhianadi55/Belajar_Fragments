package com.example.belajarfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class CounterFragment : Fragment() {
    private lateinit var tvCounter: TextView
    private var counter = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_counter, container, false)

        // Initialize views
        tvCounter = view.findViewById(R.id.tvCounter)
        val btnPlus = view.findViewById<Button>(R.id.btnPlus)
        val btnMinus = view.findViewById<Button>(R.id.btnMinus)

        // Set initial counter value
        tvCounter.text = counter.toString()

        // Set onClick listeners for buttons
        btnPlus.setOnClickListener {
            counter++
            updateCounter()
        }

        btnMinus.setOnClickListener {
            counter--
            updateCounter()
        }

        return view
    }

    private fun updateCounter() {
        tvCounter.text = counter.toString()
    }
}