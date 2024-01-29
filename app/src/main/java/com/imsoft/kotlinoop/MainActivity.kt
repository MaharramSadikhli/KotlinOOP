package com.imsoft.kotlinoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val human = Human("Name", "Surname", 23)
        human.name = "Name2"
        println(human.surname)
        human.age = 22

        val developer = Profession(
            "Name",
            "Surname",
            24,
            "Android Developer",
            true
        )

        developer.age = 23


        val androidDeveloper =
            AndroidDeveloper("Kotlin",
                "Name",
                "Surname",
                23,
                "Android Developer",
                true)

        androidDeveloper.calcSalary(3, 2000)
        androidDeveloper.professionLevel = "Junior"
        println(androidDeveloper.language)
        // polymorphism
        println(androidDeveloper.calcYearSalary(2, 2000))
        println(androidDeveloper.calcYearSalary(2, 2000, 5 ))
        println(androidDeveloper.calcYearSalary(2, 2000, 5 , 2))

    }
}