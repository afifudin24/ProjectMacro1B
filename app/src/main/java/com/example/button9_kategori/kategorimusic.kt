package com.example.button9_kategori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout

class kategorimusic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kategorimusic)

        val linearLayout8 = findViewById<LinearLayout>(R.id.linearmusic)
        val images = arrayOf(R.drawable.ratemusic_1, R.drawable.ratemusic_2, R.drawable.ratemusic_3)

        val linearverti8 = findViewById<LinearLayout>(R.id.linearvertical8)
        val imagesverti = arrayOf(R.drawable.music_1, R.drawable.music_2, R.drawable.music_3, R.drawable.music_4)

        for (imageResId in images) {
            val imageView = ImageView(this)
            imageView.setImageResource(imageResId)

            val layoutParams = LinearLayout.LayoutParams(
                resources.getDimensionPixelSize(R.dimen.image_width),  // Ganti dengan lebar gambar yang diinginkan
                resources.getDimensionPixelSize(R.dimen.image_height) // Ganti dengan tinggi gambar yang diinginkan
            )
            imageView.layoutParams = layoutParams

            linearLayout8.addView(imageView)
        }

        for (imageResId in imagesverti) {
            val imageView = ImageView(this)
            imageView.setImageResource(imageResId)

            val layoutParams = LinearLayout.LayoutParams(
                resources.getDimensionPixelSize(R.dimen.image_width),  // Ganti dengan lebar gambar yang diinginkan
                resources.getDimensionPixelSize(R.dimen.image_height) // Ganti dengan tinggi gambar yang diinginkan
            )
            imageView.layoutParams = layoutParams

            linearverti8.addView(imageView)
        }

        val imageView8 = findViewById<ImageView>(R.id.buttonmusic)
        imageView8.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@kategorimusic, MainActivity::class.java)
            startActivity(intent)
        })

    }
}