package de.nenick.example.dbflow

import com.raizlabs.android.dbflow.annotation.Column
import com.raizlabs.android.dbflow.annotation.PrimaryKey
import com.raizlabs.android.dbflow.annotation.Table
import com.raizlabs.android.dbflow.structure.BaseModel
import de.nenick.example.dbflow.AppDatabase
import java.util.*

@Table(name = "items", database = AppDatabase::class)
class Item : BaseModel() {

    @PrimaryKey(autoincrement = true)
    @Column(name = "id")
    var id: Long = 0

    @Column(name = "updated_at")
    var updatedAt: Calendar = Calendar.getInstance()

}