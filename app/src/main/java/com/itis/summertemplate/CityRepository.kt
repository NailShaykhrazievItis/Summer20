package com.itis.summertemplate

object CityRepository {

    val cities by lazy {
        listOf(
            City(1, "Kazan", "RF"),
            City(2, "Moscow", "RF"),
            City(3, "Paris", "FR"),
            City(4, "Tokyo", "JP"),
            City(5, "London", "ENG"),
            City(6, "New York", "USA"),
            City(7, "Rome", "IT")
        )
    }
}
