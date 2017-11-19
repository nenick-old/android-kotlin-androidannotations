package de.nenick.example

import android.content.Context
import com.raizlabs.android.dbflow.config.AppDatabaseapp_Database
import com.raizlabs.android.dbflow.config.DatabaseHolder
import com.raizlabs.android.dbflow.config.FlowConfig
import com.raizlabs.android.dbflow.config.FlowManager
import de.nenick.example.dagger.components.DaggerSolarSystem
import org.junit.Test
import org.mockito.Mockito.mock

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class KotlinBasedTest {

    @Test
    fun androidAnnotations(){
        val activity = MainActivity_()
        activity.setContentView(null)
        // stacktrace has no info about our activity
    }

    @Test
    fun androidAnnotationsCompile(){
        val activity = MainActivity_()
        // following line does not compile
        // activity.onViewChanged(null)
    }

    @Test
    fun dagger(){
        DaggerSolarSystem.builder().build()
        // call and debug generated class works
    }

    @Test
    fun dbflow(){
        val config = FlowConfig.Builder(mock(Context::class.java)).build()
        FlowManager.init(config)
        val blub = AppDatabaseapp_Database(mock(DatabaseHolder::class.java))
        blub.isInMemory
        // call and debug generated class works
    }
}
