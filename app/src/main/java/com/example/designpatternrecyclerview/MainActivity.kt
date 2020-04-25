package com.example.designpatternrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.designpatternrecyclerview.DataType.*
import com.example.designpatternrecyclerview.viewholder.ViewHolder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        recyclerView.addItemDecoration(DividerItemDecoration(this, RecyclerView.VERTICAL))
        recyclerView.adapter = MyAdapter(listOf(
            A,
            C,
            AB,
            ABC,
            BC,
            AC,
            B,
            BC,
            ABC,
            C,
            C,
            AC,
            B,
            BC,
            AC,
            B,
            C,
            AB,
            ABC,
            BC,
            AC,
            B,
            BC,
            ABC,
            B,
            BC,
            AC,
            B,
            C
        ))
    }

    class MyAdapter(
        private val types: List<DataType>
    ) : RecyclerView.Adapter<ViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder.create(parent)

        override fun getItemCount(): Int = types.size

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bind(types[position])
        }
    }
}
