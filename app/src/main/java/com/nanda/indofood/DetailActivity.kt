package com.nanda.indofood

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val makanan = intent.getParcelableExtra<Makanan>("makanan")

        updateUI(makanan)
    }

    private fun updateUI(makanan: Makanan?) {
        makanan?.let {
            findViewById<TextView>(R.id.textNamaDetail).text = "Nama Makanan : ${it.nama}"
            findViewById<TextView>(R.id.textHargaDetail).text = "Harga : ${it.harga}"
            findViewById<TextView>(R.id.textAsalDetail).text = "Asal : ${it.asal}"
            findViewById<ImageView>(R.id.imageMakananDetail).setImageResource(it.gambar)
            findViewById<TextView>(R.id.textDetail) .text=it.deskripsi
        }
    }
}

