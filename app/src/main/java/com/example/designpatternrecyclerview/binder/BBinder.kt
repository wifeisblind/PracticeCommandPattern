package com.example.designpatternrecyclerview.binder

import com.example.designpatternrecyclerview.viewholder.Operator

class BBinder : Binder {

    override fun bind(operator: Operator) {
        operator.reset()
        operator.doB()
        operator.setTitle("B")
    }
}