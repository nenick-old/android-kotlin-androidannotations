package de.nenick.example.dagger.components

import dagger.Component
import de.nenick.example.dagger.modules.OuterPlanetsModule
import de.nenick.example.dagger.modules.SomePlanetsModule
import de.nenick.example.dagger.modules.TerrestrialPlanetsModule
import de.nenick.example.dagger.planets.OuterPlanets
import de.nenick.example.dagger.planets.PlanetsMap
import de.nenick.example.dagger.planets.TerrestrialPlanets
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(TerrestrialPlanetsModule::class, OuterPlanetsModule::class, SomePlanetsModule::class)) interface SolarSystem {
    fun terrestrial() : TerrestrialPlanets
    fun outer() : OuterPlanets
    fun planets(): PlanetsMap
}
