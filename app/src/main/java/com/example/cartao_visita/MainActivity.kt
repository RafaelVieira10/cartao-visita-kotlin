package com.example.cartao_visita

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartao_visita.ui.theme.Cartao_visitaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Cartao_visitaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(85, 204, 239)
                ) {
                    Header()
                }
            }
        }
    }
}



@Composable
fun Imagem() {
    val imageDeveloper = painterResource(id = R.drawable.developer)

    Box{
        Image(
            painter = imageDeveloper,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(120.dp)
                .clip((CircleShape))
        )
    }
}

@Composable
fun Header() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Imagem()
        Text(
            text = "Rafael Vieira",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif,
            textAlign = TextAlign.Center,
        )
        Text(
            text = "Systems Developer",
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.Serif
        )
        Footer()
    }

}

@Composable
fun Contacts(positionImg: Int, text : String) {
    Row(
        modifier = Modifier.padding(top = 15.dp)
    ) {
        val img = painterResource(id = positionImg)
        Image(painter = img, contentDescription = null)
        Text(
            text = text,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.padding(start = 20.dp)
        )
        
    }
}

@Composable
fun Footer() {
    Column(
        modifier = Modifier.padding(top = 150.dp)
    ) {
        Contacts(R.drawable.email, text = "rafael.rvs23@gmail.com")
        Contacts(R.drawable.telefone, text = "(11) 95141-6353")
        Contacts(R.drawable.instagram, text = "rafael.vieira11")
    }
}





@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Cartao_visitaTheme {
        Header()
    }
}