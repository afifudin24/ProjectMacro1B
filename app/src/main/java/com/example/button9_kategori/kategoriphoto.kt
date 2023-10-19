package com.example.button9_kategori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout

class kategoriphoto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kategoriphoto)

        val linearLayout5 = findViewById<LinearLayout>(R.id.linearphoto)
        val images = arrayOf(R.drawable.ratephoto_1, R.drawable.ratephoto_2, R.drawable.ratephoto_3)

        val linearverti5 = findViewById<LinearLayout>(R.id.linearvertical5)
        val imagesverti = arrayOf(R.drawable.photo_1, R.drawable.photo_2, R.drawable.photo_3, R.drawable.photo_4)

        for (imageResId in images) {
            val imageView = ImageView(this)
            imageView.setImageResource(imageResId)

            val layoutParams = LinearLayout.LayoutParams(
                resources.getDimensionPixelSize(R.dimen.image_width),  // Ganti dengan lebar gambar yang diinginkan
                resources.getDimensionPixelSize(R.dimen.image_height) // Ganti dengan tinggi gambar yang diinginkan
            )
            imageView.layoutParams = layoutParams

            linearLayout5.addView(imageView)
        }

        for (imageResId in imagesverti) {
            val imageView = ImageView(this)
            imageView.setImageResource(imageResId)

            val layoutParams = LinearLayout.LayoutParams(
                resources.getDimensionPixelSize(R.dimen.image_width),  // Ganti dengan lebar gambar yang diinginkan
                resources.getDimensionPixelSize(R.dimen.image_height) // Ganti dengan tinggi gambar yang diinginkan
            )
            imageView.layoutParams = layoutParams

            linearverti5.addView(imageView)
        }

        val imageView5 = findViewById<ImageView>(R.id.buttonphoto)
        imageView5.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@kategoriphoto, MainActivity::class.java)
            startActivity(intent)
        })
    }
}