package com.example.button9_kategori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout

class kategoribaju : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kategoribaju)

        val linearLayout3 = findViewById<LinearLayout>(R.id.linearbaju)
        val images = arrayOf(R.drawable.ratebaju_1, R.drawable.ratebaju_2, R.drawable.ratebaju_3)

        val linearverti3 = findViewById<LinearLayout>(R.id.linearvertical3)
        val imagesverti = arrayOf(R.drawable.baju_1, R.drawable.baju_2, R.drawable.baju_3, R.drawable.baju_4)

        for (imageResId in images) {
            val imageView = ImageView(this)
            imageView.setImageResource(imageResId)

            val layoutParams = LinearLayout.LayoutParams(
                resources.getDimensionPixelSize(R.dimen.image_width),  // Ganti dengan lebar gambar yang diinginkan
                resources.getDimensionPixelSize(R.dimen.image_height) // Ganti dengan tinggi gambar yang diinginkan
            )
            imageView.layoutParams = layoutParams

            linearLayout3.addView(imageView)
        }

        for (imageResId in imagesverti) {
            val imageView = ImageView(this)
            imageView.setImageResource(imageResId)

            val layoutParams = LinearLayout.LayoutParams(
                resources.getDimensionPixelSize(R.dimen.image_width),  // Ganti dengan lebar gambar yang diinginkan
                resources.getDimensionPixelSize(R.dimen.image_height) // Ganti dengan tinggi gambar yang diinginkan
            )
            imageView.layoutParams = layoutParams

            linearverti3.addView(imageView)
        }

        val imageView3 = findViewById<ImageView>(R.id.buttonbaju)
        imageView3.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@kategoribaju, MainActivity::class.java)
            startActivity(intent)
        })

    }
}