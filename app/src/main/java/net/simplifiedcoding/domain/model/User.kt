package net.simplifiedcoding.domain.model

data class User(
    val firstName: String,
    val id: String,
    val lastName: String,
    val picture: String,
    val title: String
){

    val name:String
    get() = "$title $firstName $lastName"
}
