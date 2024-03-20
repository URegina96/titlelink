package com.example.titlelink

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class BookListAdapter(private val books: List<Book>) : BaseAdapter() {

    override fun getCount(): Int {
        return books.size
    }

    override fun getItem(position: Int): Any {
        return books[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val book = books[position]

        val view = LayoutInflater.from(parent?.context).inflate(R.layout.item_book, parent, false)

        val titleTextView = view.findViewById<TextView>(R.id.titleTextView)
        val authorTextView = view.findViewById<TextView>(R.id.authorTextView)

        titleTextView.text = book.title
        authorTextView.text = book.author

        return view
    }
}