package com.example.designpatternrecyclerview.binder

import com.example.designpatternrecyclerview.viewholder.Operator

class ABinder : Binder {

    override fun bind(operator: Operator) {
        operator.reset()
        operator.doA()
        operator.setTitle("A")
    }
}