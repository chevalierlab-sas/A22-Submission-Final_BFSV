package com.lucky.mybook.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.lucky.mybook.databinding.ItemBookBinding
import com.lucky.mybook.model.Book

class ListBookAdaptor (private val listBook : ArrayList<Book>):
    RecyclerView.Adapter<ListBookAdaptor.ListViewHolder>() {

    private lateinit var onItemClickCallback : OnItemClickCallback

    fun setOnitemClickCallback(onItemClickCallback : OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }
    interface OnItemClickCallback {
        fun onItemClickCallback(data : Book)
    }
    inner class ListViewHolder(private val binding: ItemBookBinding) :
            RecyclerView.ViewHolder(binding.root){
                fun bind(book: Book){
                with(binding){
                    Glide.with(this.root)
                        .load(book.thumbnail)
                        .into(imgItemPhoto)

                    binding.tvItemTitle.text=book.title
                    binding.tvItemPenulis.text=book.penulis
                    binding.tvItemTahun.text=book.tahun
                    binding.tvItemTebal.text=book.tebalBuku
                    }
                }
            }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder =
        ListViewHolder(
            ItemBookBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listBook[position])
        holder.itemView.setOnClickListener {onItemClickCallback.onItemClickCallback(listBook[holder.adapterPosition])}
    }
    override fun getItemCount(): Int =listBook.size
}