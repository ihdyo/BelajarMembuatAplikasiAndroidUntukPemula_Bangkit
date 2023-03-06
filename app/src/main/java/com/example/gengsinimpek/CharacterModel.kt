package com.example.gengsinimpek

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
data class CharacterModel (
    var url : String? = null,
    var icon : String? = null,
    var wish : String? = null,
    var item : String? = null,
    var name : String? = null,
    var quality : Int = 0,
    var title : String? = null,
    var birthday : String? = null,
    var constellation : String? = null,
    var element : String? = null,
    var weapon : String? = null,
    var region : String? = null,
    var detail : String? = null
) : Parcelable