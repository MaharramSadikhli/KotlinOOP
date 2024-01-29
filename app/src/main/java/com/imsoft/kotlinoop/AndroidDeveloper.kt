package com.imsoft.kotlinoop

// inheritance
class AndroidDeveloper(
    language: String, name: String, surname: String, age: Int,
    profession: String, isWorking: Boolean
) : Developer(
    name, surname,
    age, profession, isWorking
) {

    var language: String = language
        get
        private set
}