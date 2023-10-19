package com.example.button9_kategori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout

class kategoridesign : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kategoridesign)

        val linearLayout7 = findViewById<LinearLayout>(R.id.lineardesign)
        val images = arrayOf(R.drawable.ratecard_1, R.drawable.ratecard_2, R.drawable.ratecard_3)

        val linearverti7 = findViewById<LinearLayout>(R.id.linearvertical7)
        val imagesverti = arrayOf(R.drawable.card_1, R.drawable.card_2, R.drawable.card_3, R.drawable.card_4)

        for (imageResId in images) {
            val imageView = ImageView(this)
            imageView.setImageResource(imageResId)

            val layoutParams = LinearLayout.LayoutParams(
                resources.getDimensionPixelSize(R.dimen.image_width),  // Ganti dengan lebar gambar yang diinginkan
                resources.getDimensionPixelSize(R.dimen.image_height) // Ganti dengan tinggi gambar yang diinginkan
            )
            imageView.layoutParams = layoutParams

            linearLayout7.addView(imageView)
        }

        for (imageResId in imagesverti) {
            val imageView = ImageView(this)
            imageView.setImageResource(imageResId)

            val layoutParams = LinearLayout.LayoutParams(
                resources.getDimensionPixelSize(R.dimen.image_width),  // Ganti dengan lebar gambar yang diinginkan
                resources.getDimensionPixelSize(R.dimen.image_height) // Ganti dengan tinggi gambar yang diinginkan
            )
            imageView.layoutParams = layoutParams

            linearverti7.addView(imageView)
        }

        val imageView7 = findViewById<ImageView>(R.id.buttondesign)
        imageView7.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@kategoridesign, MainActivity::class.java)
            startActivity(intent)
        })

    }
}