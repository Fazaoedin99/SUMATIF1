package com.example.sumatif1genapmisbahudin_faza

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AdapterSiswa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adapter_siswa)
    }

    fun Kevisi(view: View) {
        val pindah = Intent(this, VisiMisi::class.java)
        startActivity(pindah)
    }
}