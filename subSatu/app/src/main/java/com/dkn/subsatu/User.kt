package com.dkn.subsatu

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    var avatar: Int,
    var username: String,
    var name: String,
    var company: String,
    var location: String,
    var repository: String,
    var followers: String,
    var following: String
):Parcelable