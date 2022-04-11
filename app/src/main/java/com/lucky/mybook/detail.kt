package com.lucky.mybook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lucky.mybook.data.BookData
import com.lucky.mybook.databinding.ActivityDetailBinding
import com.lucky.mybook.model.Book
import com.lucky.mybook.model.BookIntent

class detail : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    companion object{
    const val USER = "user"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        if(intent.hasExtra(USER)){
            val user =intent.getParcelableExtra<BookIntent>(USER) as BookIntent

            binding.tvTitleDetail.text = user.title
            binding.ivPhotoDetail.setImageResource(user.thumbnail)
            binding.tvPenulisDetail.text = user.penulis
            binding.tvTahunDetail.text = user.tahun
            binding.tvTebalDetail.text = user.tebalBuku
            binding.tvSinopsisDetail.text = user.sinopsis
        }
    }
}