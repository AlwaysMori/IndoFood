package com.nanda.indofood

import android.os.Parcel
import android.os.Parcelable

data class Makanan(
    val nama: String,
    val harga: Int,
    val asal: String,
    val gambar: Int,
    val deskripsi: String
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.readInt(),
        parcel.readString() ?: "",
        parcel.readInt(),
       parcel.readString() ?:""
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nama)
        parcel.writeInt(harga)
        parcel.writeString(asal)
        parcel.writeInt(gambar)
        parcel.writeString(deskripsi)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Makanan> {
        override fun createFromParcel(parcel: Parcel): Makanan {
            return Makanan(parcel)
        }

        override fun newArray(size: Int): Array<Makanan?> {
            return arrayOfNulls(size)
        }
    }
}