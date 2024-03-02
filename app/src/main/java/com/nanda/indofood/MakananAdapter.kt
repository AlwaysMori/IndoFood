package com.nanda.indofood

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MakananAdapter(val MakananList: List<Makanan>) : RecyclerView.Adapter<MakananAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvNama: TextView = itemView.findViewById(R.id.textNama)
        val tvHarga: TextView = itemView.findViewById(R.id.textHarga)
        val tvAsal: TextView = itemView.findViewById(R.id.textAsal)
        val imageMakanan: ImageView = itemView.findViewById(R.id.imageMakanan)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_makanan, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val MakanItem = MakananList[position]
        holder.imageMakanan.setImageResource(MakanItem.gambar)
        holder.tvNama.text = MakanItem.nama
        holder.tvHarga.text = "Harga: ${MakanItem.harga}"
        holder.tvAsal.text = "Asal: ${MakanItem.asal}"
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.putExtra("makanan", MakanItem)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return MakananList.size
    }
}
