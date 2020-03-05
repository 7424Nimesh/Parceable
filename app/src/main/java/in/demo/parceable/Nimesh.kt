package `in`.demo.parceable

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by Nimesh Shah on 5/3/20.
 */
@Parcelize
data class Nimesh(var id:Int,var name: String,var address: String,var age:Int) : Parcelable{

    companion object{
        val EXTRA:String = "nimesh"
    }
}