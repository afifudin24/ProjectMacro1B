package com.example.wo_macro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.view.View
import android.widget.CheckBox

class KeranjangSaya : AppCompatActivity() {
    private var counter = 0
    private lateinit var counterText: TextView
    private lateinit var plusButton: Button
    private lateinit var minusButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keranjang_saya)
        val counterText = findViewById<TextView>(R.id.counterText)
        val plusButton = findViewById<Button>(R.id.plusButton)
        val minusButton = findViewById<Button>(R.id.minusButton)


        counterText.text = counter.toString()

        plusButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                counter++
                counterText.text = counter.toString()
            }
        })

        minusButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                if (counter > 0) {
                    counter--
                    counterText.text = counter.toString()
                }
            }
        })
    }

}