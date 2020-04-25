package com.example.designpatternrecyclerview.viewholder

import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.designpatternrecyclerview.DataType
import com.example.designpatternrecyclerview.DataType.*
import com.example.designpatternrecyclerview.R
import com.example.designpatternrecyclerview.binder.*
import kotlinx.android.synthetic.main.lay_item_abc.view.*

class ViewHolder(view: View) : RecyclerView.ViewHolder(view), Operator {

    private val binderMap: Map<DataType, Binder> = mapOf(
        (A to ABinder()),
        (B to BBinder()),
        (C to CBinder()),
        (AB to ABBinder()),
        (AC to ACBinder()),
        (BC to BCBinder()),
        (ABC to ABCBinder())
    )

    fun bind(type: DataType) {
        binderMap[type]?.bind(this)
    }

    override fun setTitle(text: String) {
        itemView.tvTitle.text = text
    }

    override fun doA() {
        itemView.a.visibility = VISIBLE
    }

    override fun doB() {
        itemView.b.visibility = VISIBLE
    }

    override fun doC() {
        itemView.c.visibility = VISIBLE
    }

    override fun reset() {
        itemView.tvTitle.text = ""
        itemView.a.visibility = GONE
        itemView.b.visibility = GONE
        itemView.c.visibility = GONE
    }

    companion object {
        fun create(parent: ViewGroup): ViewHolder {
            return LayoutInflater.from(parent.context)
                .inflate(R.layout.lay_item_abc, parent, false)
                .let { ViewHolder(it) }
        }
    }
}