package de.nenick.example.dagger.planets

class Neptune : Planet {

    override  fun names() : String {
        return "Neptune, Le Verrier's planet, The planet exterior to Uranus"
    }

    override fun au() : Double {
        return 30.1
    }
}
