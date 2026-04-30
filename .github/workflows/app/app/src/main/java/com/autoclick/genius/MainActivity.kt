package com.autoclick.genius

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(modifier = Modifier.fillMaxSize(), color = MaterialColor.Background) {
                Column(modifier = Modifier.padding(20.dp)) {
                    Text(text = "AutoClick Genius", style = MaterialTheme.typography.headlineMedium)
                    Spacer(modifier = Modifier.height(20.dp))
                    Button(onClick = { /* Nanti kita isi fungsinya */ }) {
                        Text("START SERVICE")
                    }
                }
            }
        }
    }
}
