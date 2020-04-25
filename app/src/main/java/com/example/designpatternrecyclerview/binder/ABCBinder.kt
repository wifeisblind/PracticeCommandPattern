package com.example.designpatternrecyclerview.binder

import com.example.designpatternrecyclerview.viewholder.Operator

class ABCBinder : Binder {

    override fun bind(operator: Operator) {
        operator.reset()
        operator.doA()
        operator.doB()
        operator.doC()
        operator.setTitle("ABC")
    }
}