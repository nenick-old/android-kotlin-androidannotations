package de.nenick.example.dagger.planets

class Mercury : Planet {

    override fun names(): String {
        return "Mercury"
    }

    override fun au(): Double {
        return 0.45
    }
}
