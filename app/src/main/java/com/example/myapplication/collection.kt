package com.example.myapplication

fun ContohList() {
    println("== List ==")
    // List Read Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)


    // List Mutable
    val mutableShapes: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(mutableShapes)

}