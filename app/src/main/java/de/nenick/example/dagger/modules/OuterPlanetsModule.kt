package de.nenick.example.dagger.modules

import dagger.Module
import dagger.Provides
import de.nenick.example.dagger.planets.*
import javax.inject.Named
import javax.inject.Singleton

@Module class OuterPlanetsModule {

    @Provides @Singleton @Named("Jupiter")
    fun fifth() : Planet {
        return Jupiter()
    }

    @Provides @Singleton @Named("Saturn")
    fun sixth() : Planet {
        return Saturn()
    }

    @Provides @Singleton @Named("Uranus")
    fun seventh() : Planet {
        return Uranus()
    }

    @Provides @Singleton @Named("Neptune")
    fun eighth() : Planet {
        return Neptune()
    }

}