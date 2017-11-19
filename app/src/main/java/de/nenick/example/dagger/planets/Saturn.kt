package de.nenick.example.dagger.planets

class Saturn : Planet {

    override fun names() : String {
        return "Saturn, Cronus, Shabbathai, Zuhal"
    }

    override fun au() : Double {
        return 9.5
    }
}
