package com.example.button9_kategori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout

class kategorimu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kategorimu)

        val linearLayout2 = findViewById<LinearLayout>(R.id.linearmu)
        val images = arrayOf(R.drawable.ratemu_1, R.drawable.ratemu_2, R.drawable.ratemu_3)

        val linearverti2 = findViewById<LinearLayout>(R.id.linearvertical2)
        val imagesverti = arrayOf(R.drawable.mu_1, R.drawable.mu_2, R.drawable.mu_3, R.drawable.mu_4)

        for (imageResId in images) {
            val imageView = ImageView(this)
            imageView.setImageResource(imageResId)

            val layoutParams = LinearLayout.LayoutParams(
                resources.getDimensionPixelSize(R.dimen.image_width),  // Ganti dengan lebar gambar yang diinginkan
                resources.getDimensionPixelSize(R.dimen.image_height) // Ganti dengan tinggi gambar yang diinginkan
            )
            imageView.layoutParams = layoutParams

            linearLayout2.addView(imageView)
        }

        for (imageResId in imagesverti) {
            val imageView = ImageView(this)
            imageView.setImageResource(imageResId)

            val layoutParams = LinearLayout.LayoutParams(
                resources.getDimensionPixelSize(R.dimen.image_width),  // Ganti dengan lebar gambar yang diinginkan
                resources.getDimensionPixelSize(R.dimen.image_height) // Ganti dengan tinggi gambar yang diinginkan
            )
            imageView.layoutParams = layoutParams

            linearverti2.addView(imageView)
        }

        val imageView2 = findViewById<ImageView>(R.id.buttonmu)
        imageView2.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@kategorimu, MainActivity::class.java)
            startActivity(intent)
        })

//        val imageView = findViewById<ImageView>(R.id.buttonmu)
//        imageView.setOnClickListener(View.OnClickListener {
//
//            val intent = Intent(this@kategorimu, MainActivity :: class.java)
//            startActivity(intent)
//        })
    }
}