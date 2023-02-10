package com.example.sumatif1genapmisbahudin_faza

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class VisiMisi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visi_misi)
    }

    fun Kebuku(view: View) {
        val pindah3 = Intent(this, Adapterbuku::class.java)
        startActivity(pindah3)
    }
}