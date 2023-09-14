package com.angelika.lesson52.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.angelika.lesson52.R
import com.angelika.lesson52.databinding.ItemManhwaBinding
import com.angelika.lesson52.models.Manhwa
import com.bumptech.glide.Glide

class ManhwaAdapter : RecyclerView.Adapter<ManhwaAdapter.ManhwaViewHolder>() {

    private var manhwas = emptyList<Manhwa>()

    fun setManhwas(manhwas: List<Manhwa>) {
        this.manhwas = manhwas
        notifyDataSetChanged()
    }

    class ManhwaViewHolder(private val binding: ItemManhwaBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(manhwa: Manhwa) = with(binding) {
            Glide.with(ivManhwa.context)
                .load(manhwa.image)
                .placeholder(R.drawable.ic_launcher_background)
                .into(ivManhwa)
            tvNameManhwa.text = manhwa.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ManhwaViewHolder {
        val binding = ItemManhwaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ManhwaViewHolder(binding)
    }

    override fun getItemCount() = manhwas.size

    override fun onBindViewHolder(holder: ManhwaViewHolder, position: Int) {
        holder.onBind(manhwas[position])
    }
}