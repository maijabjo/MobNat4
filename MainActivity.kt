package com.example.newwalkthroughtheming

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.newwalkthroughtheming.ui.theme.NewWalkthroughThemingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewWalkthroughThemingTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    walkthroughTheming()
                }
            }
        }
    }
}

@Composable
fun walkthroughTheming() {

    val appModifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Text(
        text = "My Title",
        style = MaterialTheme.typography.headlineSmall,
        modifier = appModifier
        )

       OutlinedTextField(
           value = " ",
           onValueChange = { },
           modifier = appModifier
       )

       Button(onClick = { /*Handle click*/ },
           modifier = appModifier
       ) {
           Text(text = "Submit")

       }

        }
    }

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NewWalkthroughThemingTheme {
        walkthroughTheming()
    }
}