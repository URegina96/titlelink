package com.example.titlelink

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.titlelink.databinding.ActivityBookListBinding

class BookListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityBookListBinding = DataBindingUtil.setContentView(this, R.layout.activity_book_list)

        val books = listOf(
            Book("1984", "Джордж Оруэлл"),
            Book("Мастер и Маргарита", "Михаил Булгаков"),
            Book("Улисс", "Джеймс Джойс"),
        )
        val adapter = BookListAdapter(books)
        binding.bookListView.adapter = adapter

        binding.bookList = books
    }
}