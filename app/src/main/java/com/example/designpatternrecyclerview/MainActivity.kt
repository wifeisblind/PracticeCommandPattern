package com.example.designpatternrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.designpatternrecyclerview.DataType.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.lay_item_abc.view.*

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
    ) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder.create(parent)

        override fun getItemCount(): Int = types.size

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {

            when(types[position]) {
                A -> holder.doA()
                B -> holder.doB()
                C -> holder.doC()
                AB -> holder.doAB()
                AC -> holder.doAC()
                BC -> holder.doBC()
                ABC -> holder.doABC()
            }
        }

        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

            fun doA() {
                with(itemView) {
                    tvTitle.text = "A"
                    a.visibility = VISIBLE
                    b.visibility = GONE
                    c.visibility = GONE
                }
            }

            fun doB() {
                with(itemView) {
                    tvTitle.text = "B"
                    a.visibility = GONE
                    b.visibility = VISIBLE
                    c.visibility = GONE
                }
            }

            fun doC() {
                with(itemView) {
                    tvTitle.text = "C"
                    a.visibility = GONE
                    b.visibility = GONE
                    c.visibility = VISIBLE
                }
            }

            fun doAB() {
                with(itemView) {
                    tvTitle.text = "AB"
                    a.visibility = VISIBLE
                    b.visibility = VISIBLE
                    c.visibility = GONE
                }
            }

            fun doAC() {
                with(itemView) {
                    tvTitle.text = "AC"
                    a.visibility = VISIBLE
                    b.visibility = GONE
                    c.visibility = VISIBLE
                }
            }

            fun doBC() {
                with(itemView) {
                    tvTitle.text = "BC"
                    a.visibility = GONE
                    b.visibility = VISIBLE
                    c.visibility = VISIBLE
                }
            }

            fun doABC() {
                with(itemView) {
                    tvTitle.text = "ABC"
                    a.visibility = VISIBLE
                    b.visibility = VISIBLE
                    c.visibility = VISIBLE
                }
            }

            companion object {
                fun create(parent: ViewGroup): ViewHolder {
                    return LayoutInflater.from(parent.context)
                        .inflate(R.layout.lay_item_abc, parent, false)
                        .let { ViewHolder(it) }
                }
            }
        }
    }
}
