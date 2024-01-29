package com.imsoft.kotlinoop

open class Profession(name: String, surname: String, age: Int, profession: String, isWorking: Boolean) :
    Human(name, surname, age) {


        var profession: String = profession
            set
            get

        var isWorking: Boolean = isWorking
            private set
            get

    }