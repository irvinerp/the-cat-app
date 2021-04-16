package mx.iroses.thecatapp.data

import com.google.gson.annotations.SerializedName

data class Favorite(
    @SerializedName("id") val id: Int,
    @SerializedName("user_id") val userId: String,
    @SerializedName("image_id") val imageId: String,
    @SerializedName("sub_id") val subId: String,
    @SerializedName("created_at") val createdAt: String,
    @SerializedName("image") val image: Image
)
