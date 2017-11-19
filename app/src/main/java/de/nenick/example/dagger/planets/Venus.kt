package de.nenick.example.dagger.planets

class Venus : Planet {

    override fun names(): String {
        return "Venus, Sister Planet"
    }

    override fun au(): Double {
        return 0.7
    }
}
