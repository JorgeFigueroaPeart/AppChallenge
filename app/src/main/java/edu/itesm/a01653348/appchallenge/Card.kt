package edu.itesm.a01653348.appchallenge

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.io.Serializable

@Parcelize
data class Card(val picture:Int,
                 val model:String,
                 val price: String,
                 val description: String
                 ) : Parcelable