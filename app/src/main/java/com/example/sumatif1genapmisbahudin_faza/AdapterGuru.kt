package com.example.sumatif1genapmisbahudin_faza

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AdapterGuru : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adapter_guru)
    }

    fun Kesiswa(view: View) {
        val pindah4 = Intent(this, AdapterSiswa::class.java)
        startActivity(pindah4)

    }
}