package de.nenick.example.dagger.planets

class Mars : Planet {

    override fun names(): String {
        return "Mars, Red Planet"
    }

    override fun au(): Double {
        return 1.5
    }
}
