package de.nenick.example.dagger.modules

import dagger.Module
import dagger.Provides
import de.nenick.example.dagger.planets.*

import javax.inject.Named
import javax.inject.Singleton

@Module class TerrestrialPlanetsModule {

    @Provides @Singleton @Named("Mercury") fun first() : Planet {
        return Mercury()
    }

    @Provides @Singleton @Named("Venus") fun second() : Planet {
        return Venus()
    }

    @Provides @Singleton @Named("Earth") fun third() : Planet {
        return Earth()
    }

    @Provides @Singleton @Named("Mars") fun fourth() : Planet {
        return Mars()
    }

}