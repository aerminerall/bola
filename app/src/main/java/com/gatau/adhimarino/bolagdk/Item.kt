package com.gatau.adhimarino.bolagdk

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Item(val name: String, val image: Int, val desc: String?): Parcelable

