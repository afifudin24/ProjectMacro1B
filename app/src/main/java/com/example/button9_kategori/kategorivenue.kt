package com.example.button9_kategori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout

class kategorivenue : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kategorivenue)

        val linearLayout9 = findViewById<LinearLayout>(R.id.linearvenue)
        val images = arrayOf(R.drawable.ratevenue_1, R.drawable.ratevenue_2, R.drawable.ratevenue_3)

        val linearverti9 = findViewById<LinearLayout>(R.id.linearvertical9)
        val imagesverti = arrayOf(R.drawable.venue_1, R.drawable.venue_2, R.drawable.venue_3, R.drawable.venue_4)

        for (imageResId in images) {
            val imageView = ImageView(this)
            imageView.setImageResource(imageResId)

            val layoutParams = LinearLayout.LayoutParams(
                resources.getDimensionPixelSize(R.dimen.image_width),  // Ganti dengan lebar gambar yang diinginkan
                resources.getDimensionPixelSize(R.dimen.image_height) // Ganti dengan tinggi gambar yang diinginkan
            )
            imageView.layoutParams = layoutParams

            linearLayout9.addView(imageView)
        }

        for (imageResId in imagesverti) {
            val imageView = ImageView(this)
            imageView.setImageResource(imageResId)

            val layoutParams = LinearLayout.LayoutParams(
                resources.getDimensionPixelSize(R.dimen.image_width),  // Ganti dengan lebar gambar yang diinginkan
                resources.getDimensionPixelSize(R.dimen.image_height) // Ganti dengan tinggi gambar yang diinginkan
            )
            imageView.layoutParams = layoutParams

            linearverti9.addView(imageView)
        }

        val imageView9 = findViewById<ImageView>(R.id.buttonvenue)
        imageView9.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@kategorivenue, MainActivity::class.java)
            startActivity(intent)
        })

    }
}