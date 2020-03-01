package com.example.assignmentone

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ModelClass(
    var username : String? = null,
    var password : String? = null
) : Parcelable