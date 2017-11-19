package de.nenick.example.dagger.planets

interface Planet {

    fun names(): String

    fun au(): Double

    fun asString(): String = "${names()} is ${au()} au"
}