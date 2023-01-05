package com.example.narozeniny

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.narozeniny.ui.theme.NarozeninyTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.stringResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NarozeninyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    NarozeninyObrazek(message = "Hodně štěstí Tadeáši!!", "-Bohouš")
                }
            }
        }
    }
}
@Composable
fun NarozeninyObrazek(message: String, from: String){
    val image = painterResource(id = R.drawable.androidparty)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        AhojNarozeniny(message = message, from = from)

    }
}

@Composable
fun AhojNarozeniny(message: String, from: String) {
    Column() {
        Text(
            text = message,
            fontSize = 36.sp,
            color = Color.Blue,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(top = 16.dp)

        )
        Text(
            text = from,
            fontSize = 24.sp,
            color = Color.Blue,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(top = 16.dp)

            )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NarozeninyTheme {
        NarozeninyObrazek(message = stringResource(R.string.hodne_stesti_1), "-Bohouš")
    }
}