package de.nenick.example.dagger.planets

import javax.inject.Inject
import javax.inject.Named

class TerrestrialPlanets @Inject constructor(@Named("Mercury") val mercury: Planet,
                                                    @Named("Venus") val venus: Planet,
                                                    @Named("Earth") val earth: Planet,
                                                    @Named("Mars") val mars: Planet) {
    override fun toString(): String {
        return "${mercury.asString()} ${venus.asString()} ${earth.asString()} ${mars.asString()}"
    }
}
