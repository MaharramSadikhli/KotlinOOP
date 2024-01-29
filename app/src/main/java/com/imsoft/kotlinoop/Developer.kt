package com.imsoft.kotlinoop

// inheritance
open class Developer(
    name: String, surname: String, age: Int, profession: String,
    isWorking: Boolean
) : DeveloperLevel, Salary, Profession(
    name,
    surname, age, profession, isWorking,
) {
    override var professionLevel: String
        get() = "Junior"
        set(value) {}


    override val calcSalary: (Int, Int) -> Int = { x, y -> x * y }

    fun calcYearSalary (x: Int, y: Int) : Int {
        return x * y
    }

    fun calcYearSalary (x: Int, y: Int, z: Int) : Int {
        return x * y + z
    }

    fun calcYearSalary (x: Int, y: Int, z: Int, a: Int) : Int {
        return x * y + z * a
    }
}