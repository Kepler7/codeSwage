package com.kepler.cursos.coderswag.Services

import com.kepler.cursos.coderswag.Model.Category
import com.kepler.cursos.coderswag.Model.Product

object DataService
{
    val categories = listOf(
            Category("SHIRTS","shirtimage"),
            Category("HATS","hatimage"),
            Category("HATS","hatimage"),
            Category("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie","$18","hat01"),
            Product("Devslopes Hat Black","$20","hat02"),
            Product("Devslopes Hat White","$18","hat03"),
            Product("Devslopes Hat Snapback","$22","hat04")
    )

    val hoodies = listOf(
            Product("Devslopes Hoddie Gray","$28","hoddie01"),
            Product("Devslopes Hoddie Red", "$28","hoddie02"),
            Product("Devslopes Gray Hoodie", "$28","hoddie03"),
            Product("Devslopes Hoddie Black", "$28","hoddie04")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Black","$18","shirt01"),
            Product("Devslopes Badge Light Gray", "$20","shirt02"),
            Product("Devslopes Logo Shirt Red", "$22","shirt03"),
            Product("Devslopes Hustle", "$22","shirt04"),
            Product("Kickflip Studios", "$18","shirt05")
    )
}