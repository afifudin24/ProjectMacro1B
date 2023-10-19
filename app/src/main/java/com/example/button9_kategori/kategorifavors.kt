package com.example.button9_kategori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout

class kategorifavors : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kategorifavors)

        val linearLayout6 = findViewById<LinearLayout>(R.id.linearfavors)
        val images = arrayOf(R.drawable.ratefavors_1, R.drawable.ratefavors_2, R.drawable.ratefavors_3)

        val linearverti6 = findViewById<LinearLayout>(R.id.linearvertical6)
        val imagesverti = arrayOf(R.drawable.favors_1, R.drawable.favors_2, R.drawable.favors_3, R.drawable.favors_4)

        for (imageResId in images) {
            val imageView = ImageView(this)
            imageView.setImageResource(imageResId)

            val layoutParams = LinearLayout.LayoutParams(
                resources.getDimensionPixelSize(R.dimen.image_width),  // Ganti dengan lebar gambar yang diinginkan
                resources.getDimensionPixelSize(R.dimen.image_height) // Ganti dengan tinggi gambar yang diinginkan
            )
            imageView.layoutParams = layoutParams

            linearLayout6.addView(imageView)
        }

        for (imageResId in imagesverti) {
            val imageView = ImageView(this)
            imageView.setImageResource(imageResId)

            val layoutParams = LinearLayout.LayoutParams(
                resources.getDimensionPixelSize(R.dimen.image_width),  // Ganti dengan lebar gambar yang diinginkan
                resources.getDimensionPixelSize(R.dimen.image_height) // Ganti dengan tinggi gambar yang diinginkan
            )
            imageView.layoutParams = layoutParams

            linearverti6.addView(imageView)
        }

        val imageView6 = findViewById<ImageView>(R.id.buttonfavors)
        imageView6.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@kategorifavors, MainActivity::class.java)
            startActivity(intent)
        })

    }
}