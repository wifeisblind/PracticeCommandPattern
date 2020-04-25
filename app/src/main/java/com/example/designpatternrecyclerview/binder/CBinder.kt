package com.example.designpatternrecyclerview.binder

import com.example.designpatternrecyclerview.viewholder.Operator

class CBinder : Binder {

    override fun bind(operator: Operator) {
        operator.reset()
        operator.doC()
        operator.setTitle("C")
    }
}