package com.optiapp.myapplication

class inheritance {
    val subclass=Subclass(2500)
    val anotherclass=Anotherclass(4500)
    println("=================")
    println("Color: ${subclass.color}")
    println("Name: ${subclass.name}")
    println("Cost: ${subclass.cost}")
    
    println("=================")
    println("Color: ${anotherclass.color}")
    println("Name: ${anotherclass.name}")
    println("Cost: ${anotherclass.cost}")



}
abstract class car(private var expense:Int){
    abstract val color: String
    abstract val name: String

    fun cost(): Int{
        return expense
    }
}
class Subclass(expense: Int):car(expense){
    override val color="blue"
    override val name="ferrari"
}
class Anotherclass(expense: Int):car(expense){
    override val color="blue"
    override val name="bugati"
}
