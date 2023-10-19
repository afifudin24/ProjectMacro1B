package com.example.button9_kategori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttondecor = findViewById<Button>(R.id.buttondecor)
        buttondecor.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@MainActivity, kategoridecor :: class.java)
            startActivity(intent)
        })

        val buttonmu = findViewById<Button>(R.id.buttonmu)
        buttonmu.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@MainActivity, kategorimu :: class.java)
            startActivity(intent)
        })

        val buttonbaju = findViewById<Button>(R.id.buttonclothes)
        buttonbaju.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@MainActivity, kategoribaju :: class.java)
            startActivity(intent)
        })

        val buttoncatering = findViewById<Button>(R.id.buttoncate)
        buttoncatering.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@MainActivity, kategoricatering :: class.java)
            startActivity(intent)
        })

        val buttonphoto = findViewById<Button>(R.id.buttonphoto)
        buttonphoto.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@MainActivity, kategoriphoto :: class.java)
            startActivity(intent)
        })

        val buttonfavors = findViewById<Button>(R.id.buttonfavors)
        buttonfavors.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@MainActivity, kategorifavors :: class.java)
            startActivity(intent)
        })

        val buttondesign = findViewById<Button>(R.id.buttoncard)
        buttondesign.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@MainActivity, kategoridesign :: class.java)
            startActivity(intent)
        })

        val buttonmusic = findViewById<Button>(R.id.buttonmusic)
        buttonmusic.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@MainActivity, kategorimusic :: class.java)
            startActivity(intent)
        })

        val buttonvenue = findViewById<Button>(R.id.buttonvenue)
        buttonvenue.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@MainActivity, kategorivenue :: class.java)
            startActivity(intent)
        })

    }
}