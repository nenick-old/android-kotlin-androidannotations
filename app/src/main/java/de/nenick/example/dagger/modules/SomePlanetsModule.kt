package de.nenick.example.dagger.modules

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import de.nenick.example.dagger.planets.SomePlanetKey
import de.nenick.example.dagger.planets.SomePlanetsEnum

@Module
class SomePlanetsModule {
    @Provides
    @IntoMap
    @SomePlanetKey(SomePlanetsEnum.EARTH)
    fun earth(): Int {
        return 3
    }
}
