package com.example.button9_kategori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout

class kategoridecor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kategoridecor)

        val linearLayout = findViewById<LinearLayout>(R.id.lineardecor)
        val images = arrayOf(R.drawable.ratedecor_1, R.drawable.ratedecor_2, R.drawable.ratedecor_3)

        val linearverti = findViewById<LinearLayout>(R.id.linearvertical)
        val imagesverti = arrayOf(R.drawable.decor_1, R.drawable.decor_2, R.drawable.decor_3, R.drawable.decor_4)

        for (imageResId in images) {
            val imageView = ImageView(this)
            imageView.setImageResource(imageResId)

            val layoutParams = LinearLayout.LayoutParams(
                resources.getDimensionPixelSize(R.dimen.image_width),  // Ganti dengan lebar gambar yang diinginkan
                resources.getDimensionPixelSize(R.dimen.image_height) // Ganti dengan tinggi gambar yang diinginkan
            )
            imageView.layoutParams = layoutParams

            linearLayout.addView(imageView)
        }

        for (imageResId in imagesverti) {
            val imageView = ImageView(this)
            imageView.setImageResource(imageResId)

            val layoutParams = LinearLayout.LayoutParams(
                resources.getDimensionPixelSize(R.dimen.image_width),  // Ganti dengan lebar gambar yang diinginkan
                resources.getDimensionPixelSize(R.dimen.image_height) // Ganti dengan tinggi gambar yang diinginkan
            )
            imageView.layoutParams = layoutParams

            linearverti.addView(imageView)
        }

        val imageView = findViewById<ImageView>(R.id.buttonback)
        imageView.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@kategoridecor, MainActivity :: class.java)
            startActivity(intent)
        })

    }
}

