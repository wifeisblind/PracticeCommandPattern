package com.example.designpatternrecyclerview.viewholder

interface Operator {
    fun setTitle(text: String)
    fun doA()
    fun doB()
    fun doC()
    fun reset()
}