package net.simplifiedcoding.domain.model

import androidx.compose.ui.text.capitalize
import androidx.compose.ui.text.intl.Locale

data class User(
    val firstName: String,
    val id: String,
    val lastName: String,
    val picture: String,
    val title: String
) {

    val name: String
        get() = "${if (title == "miss") "Miss" else title.capitalize(locale = Locale.current) + "."} $firstName $lastName"
}
