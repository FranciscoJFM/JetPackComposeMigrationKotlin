package com.example.jetpackcomposemigration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      /*  setContentView(R.layout.activity_main)
        val helloView = findViewById<ComposeView>(R.id.hello)
        helloView.setContent {
hello()
        }*/

        setContent {
            hello()
        }
    }
}

@Preview
@Composable
private fun hello() {
    Text(
        text = "Hola jetpack compose",
        modifier = Modifier.wrapContentWidth(align = Alignment.CenterHorizontally)
    )
    AndroidView(factory = {
        TextView(it).apply {
            text = "Hello"
        }
    })
}
