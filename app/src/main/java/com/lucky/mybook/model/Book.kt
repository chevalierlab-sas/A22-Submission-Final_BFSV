package com.lucky.mybook.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Book (
    var title : String = "",
    var penulis : String = "",
    var tebalBuku : String = "",
    var tahun : String = "",
    var sinopsis : String = "",
    var thumbnail : Int = 0
) : Parcelable

