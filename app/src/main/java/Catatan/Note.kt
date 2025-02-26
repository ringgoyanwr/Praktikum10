package Catatan

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note_table")

data class Note(
var title: String,
var description: String,
var description2: String,
var priority: Int
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}