package com.example.compose_quadrant
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_quadrant.ui.theme.Compose_quadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_quadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuadrant()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrant(modifier: Modifier = Modifier){
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            infoCard(
                firstLine = stringResource(R.string.text_composable_title),
                secondLine = stringResource(R.string.text_composable_body),
                modifier = Modifier.weight(1f),
                backgroundColor = Color(0xFFEADDFF)

            )
            infoCard(
                firstLine = stringResource(R.string.image_composable_title),
                secondLine = stringResource(R.string.image_composable_body),
                modifier = Modifier.weight(1f),
                backgroundColor = Color(0xFFD0BCFF)
            )
        }

        Row(Modifier.weight(1f)){
            infoCard(
                firstLine = stringResource(id = R.string.row_composable_title),
                secondLine = stringResource(id = R.string.row_composable_body),
                modifier = Modifier.weight(1f),
                backgroundColor = Color(0xFFB69DF8)
            )
            infoCard(
                firstLine = stringResource(id = R.string.column_composable_title),
                secondLine = stringResource(id = R.string.column_composable_body),
                modifier = Modifier.weight(1f),
                backgroundColor = Color(0xFFF6EDFF)
            )
        }

    }
}

@Composable
fun infoCard(firstLine: String, secondLine: String, backgroundColor: Color, modifier: Modifier = Modifier) {

    Column(modifier = modifier.padding(16.dp).fillMaxSize().background(backgroundColor),  verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = firstLine,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold,

        )
        Text(
            text = secondLine,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeQuadrantPreview() {
    Compose_quadrantTheme {
      ComposeQuadrant()

    }
}