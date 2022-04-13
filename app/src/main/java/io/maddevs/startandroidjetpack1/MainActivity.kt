package io.maddevs.startandroidjetpack1

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.maddevs.startandroidjetpack1.ui.theme.StartAndroidJetpack1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center,
            ) {
                CircleItem()
            }

        }
    }
}

@Composable
private fun CircleItem() {
    var counter = remember {
        mutableStateOf(0)
    }

    var colour = remember {
        mutableStateOf(Color.Blue)
    }

    Box(modifier = Modifier
        .size(100.dp)
        .background(color = colour.value, shape = CircleShape)
        .clickable {
            when(counter.value++){
                10 -> colour.value = Color.Red
                0 -> colour.value = Color.DarkGray
            }
        }, contentAlignment = Alignment.Center
    ) {
        Text(text = counter.value.toString(), style = TextStyle(Color.White, fontSize = 14.sp))
    }
}
