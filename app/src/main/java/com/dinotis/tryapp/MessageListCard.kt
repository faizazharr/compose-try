package com.dinotis.tryapp

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.dinotis.tryapp.ui.theme.AppTheme

@Composable
fun Conversation(messages: List<Message>) {
    LazyColumn {
        items(messages) { message ->
            FullMessageCardShape(message)
        }
    }
}

@Composable
fun ConversationAnimation(messages: List<Message>) {
    LazyColumn {
        items(messages) { message ->
            FullMessageCardAnimation(message)
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
fun PreviewConversation() {
    AppTheme {
        Conversation(SampleData.conversationSample)
    }
}

@Preview(
    showBackground = true
)
@Composable
fun PreviewConversationAnimation() {
    AppTheme {
        ConversationAnimation(SampleData.conversationSample)
    }
}
