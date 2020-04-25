package com.example.designpatternrecyclerview.binder

import com.example.designpatternrecyclerview.viewholder.Operator

class ACBinder : Binder {

    override fun bind(operator: Operator) {
        operator.reset()
        operator.doA()
        operator.doC()
        operator.setTitle("AC")
    }
}