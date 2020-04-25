package com.example.designpatternrecyclerview.binder

import com.example.designpatternrecyclerview.viewholder.Operator

class ABBinder : Binder {

    override fun bind(operator: Operator) {
        operator.reset()
        operator.doA()
        operator.doB()
        operator.setTitle("AB")
    }
}