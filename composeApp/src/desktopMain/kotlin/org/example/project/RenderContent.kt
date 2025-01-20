package org.example.project

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage


@Composable
fun RenderContent(content: Content) {
    when (content) {
        is Content.Text -> {
            Text(
                text = content.text,
                fontSize = 18.sp,
                modifier = Modifier.padding(8.dp)
            )
        }
        is Content.Image -> {
            AsyncImage(
                model = content.img, // URL or resource ID
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp)
                    .padding(8.dp),
            )
        }
    }
}
