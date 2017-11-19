package de.nenick.example

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.androidannotations.annotations.Click
import org.androidannotations.annotations.EActivity

@EActivity
open class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @Click(R.id.text)
    open fun onClick(){

    }
}
