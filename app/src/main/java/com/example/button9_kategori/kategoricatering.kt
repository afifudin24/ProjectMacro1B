package com.example.button9_kategori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout

class kategoricatering : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kategoricatering)

        val linearLayout4 = findViewById<LinearLayout>(R.id.linearcate)
        val images = arrayOf(R.drawable.ratecatering_1, R.drawable.ratecatering_2, R.drawable.ratecatering_3)

        val linearverti4 = findViewById<LinearLayout>(R.id.linearvertical4)
        val imagesverti = arrayOf(R.drawable.cate_1, R.drawable.cate_2, R.drawable.cate_3, R.drawable.cate_4)

        for (imageResId in images) {
            val imageView = ImageView(this)
            imageView.setImageResource(imageResId)

            val layoutParams = LinearLayout.LayoutParams(
                resources.getDimensionPixelSize(R.dimen.image_width),  // Ganti dengan lebar gambar yang diinginkan
                resources.getDimensionPixelSize(R.dimen.image_height) // Ganti dengan tinggi gambar yang diinginkan
            )
            imageView.layoutParams = layoutParams

            linearLayout4.addView(imageView)
        }

        for (imageResId in imagesverti) {
            val imageView = ImageView(this)
            imageView.setImageResource(imageResId)

            val layoutParams = LinearLayout.LayoutParams(
                resources.getDimensionPixelSize(R.dimen.image_width),  // Ganti dengan lebar gambar yang diinginkan
                resources.getDimensionPixelSize(R.dimen.image_height) // Ganti dengan tinggi gambar yang diinginkan
            )
            imageView.layoutParams = layoutParams

            linearverti4.addView(imageView)
        }

        val imageView4 = findViewById<ImageView>(R.id.buttoncate)
        imageView4.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@kategoricatering, MainActivity::class.java)
            startActivity(intent)
        })

    }
}