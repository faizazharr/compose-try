package com.dinotis.tryapp

import android.content.res.Configuration
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun OldMessageCard(name: String) {
    Text(text = "Hello $name!")
}

@Preview
@Composable
fun PreviewOldMessageCard() {
    OldMessageCard("World")
}
