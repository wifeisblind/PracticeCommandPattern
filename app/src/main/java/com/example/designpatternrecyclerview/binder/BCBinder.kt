package com.example.designpatternrecyclerview.binder

import com.example.designpatternrecyclerview.viewholder.Operator

class BCBinder : Binder {

    override fun bind(operator: Operator) {
        operator.reset()
        operator.doB()
        operator.doC()
        operator.setTitle("BC")
    }
}