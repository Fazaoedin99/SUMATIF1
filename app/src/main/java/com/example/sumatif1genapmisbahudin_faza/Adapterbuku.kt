package com.example.sumatif1genapmisbahudin_faza

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.Dataset
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.NonDisposableHandle.parent
import java.lang.reflect.Type
import java.text.FieldPosition

class Adapterbuku(private val dataset: ArrayList<DataBuku>):
    RecyclerView.Adapter<Adapterbuku.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var gambar: ImageView = view.findViewById(R.id.gambarbuku)
        var buku : TextView = view.findViewById(R.id.tempatbuku)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflate = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_adapterbuku,parent,false)
        return ViewHolder(inflate)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val DataBuku = dataset[position]
        holder.gambar.setImageResource(DataBuku.gambar)
        holder.buku.text = (DataBuku.buku)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}

