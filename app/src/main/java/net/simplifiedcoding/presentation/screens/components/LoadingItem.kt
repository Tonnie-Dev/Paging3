package net.simplifiedcoding.presentation.screens.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LoadingItem() {
    Box(
            modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
            contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator(
                modifier = Modifier
                        .width(42.dp)
                        .height(42.dp)
                        .padding(8.dp),
                strokeWidth = 5.dp
        )

    }
}
