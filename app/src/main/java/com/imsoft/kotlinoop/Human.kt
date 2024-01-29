package com.imsoft.kotlinoop

// primary constructor
open class Human(name: String, surname: String, age: Int) {

    // encapsulation
    var name: String = name
        set
        get

    var surname: String = surname
        private set
        get


    var age: Int = age
        set
        get


}