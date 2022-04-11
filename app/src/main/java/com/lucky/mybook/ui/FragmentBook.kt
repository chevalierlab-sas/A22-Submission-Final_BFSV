package com.lucky.mybook.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.lucky.mybook.adapter.ListBookAdaptor
import com.lucky.mybook.data.BookData
import com.lucky.mybook.databinding.FragmentBookBinding
import com.lucky.mybook.detail
import com.lucky.mybook.detail.Companion.USER
import com.lucky.mybook.model.Book
import com.lucky.mybook.model.BookIntent

class FragmentBook : Fragment() {

    private lateinit var binding: FragmentBookBinding
    private var list :ArrayList<Book> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //Inflate the layout for this fragment
        binding = FragmentBookBinding.inflate(layoutInflater, container, false )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list.addAll(BookData.listData)
        showRecycleList()
    }

    private fun showRecycleList() {
        val listBookAdaptor = ListBookAdaptor(list)
        with(binding.rvBook){
            setHasFixedSize(true)
            adapter = listBookAdaptor
    }
    listBookAdaptor.setOnitemClickCallback(object: ListBookAdaptor.OnItemClickCallback{
        override fun onItemClickCallback(data: Book){
            setupRecycleView(data)
        }
    })
}
    private fun setupRecycleView(book: Book){
    val bookIntent = BookIntent(
        thumbnail = book.thumbnail,
        title = book.title,
        penulis = book.penulis,
        tahun = book.tahun,
        tebalBuku = book.tebalBuku,
        sinopsis = book.sinopsis,
    )
        startActivity(
            Intent(activity, detail::class.java)
                .putExtra(USER, bookIntent)
        )
    }
}