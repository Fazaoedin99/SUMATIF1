package com.example.sumatif1genapmisbahudin_faza

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class menu_home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_home)
    }

    fun Kevisi(view: View) {
        val pindah = Intent(this, VisiMisi::class.java)
        startActivity(pindah)
    }

    fun Keguru(view: View) {
        val pindah2 = Intent(this, AdapterGuru::class.java)
        startActivity(pindah2)
    }

    fun Kebuku(view: View) {
        val pindah3 = Intent(this, Adapterbuku::class.java)
        startActivity(pindah3)
    }

    fun Kesiswa(view: View) {
        val pindah4 = Intent(this, AdapterSiswa::class.java)
        startActivity(pindah4)
    }
}


