package com.example.sumatif1genapmisbahudin_faza

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity (data: ArrayList<DataGambar>) : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerAdapter: RecyclerView.Adapter<*>
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.listdata)
        var data = ArrayList<DataGambar>()
        data.add(DataGambar(R.drawable.teknologi, "Teknologi",))
        data.add(DataGambar(R.drawable.otomotif, "Otomotif"))
        data.add(DataGambar(R.drawable.sejarah, "Sejarah"))
        data.add(DataGambar(R.drawable.kesenian, "Kesenian"))
        data.add(DataGambar(R.drawable.ekonomi, "Ekonomi"))

        // menambahkan data kedalam adapter
        recyclerAdapter = Adapternya(data)
        // menambahkan layout manager
        layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        // memanggil adapter
        recyclerView.adapter = recyclerAdapter
        // menampilkan data ke layout
        recyclerView.layoutManager = layoutManager
    }

}







