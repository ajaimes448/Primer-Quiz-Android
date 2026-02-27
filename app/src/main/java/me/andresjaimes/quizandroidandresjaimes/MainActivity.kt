package me.andresjaimes.quizandroidandresjaimes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.andresjaimes.quizandroidandresjaimes.ui.theme.QuizAndroidAndresJaimesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}


@Preview(showBackground = true)
@Composable
fun primer() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Encabezado", modifier = Modifier
                .background(Color.Blue)
        )
        Row(
            modifier = Modifier
                .width(350.dp)
                .height(50.dp)
                .background(Color.Green),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Item 1",
                //textAlign = Alignment.Center,
                modifier = Modifier
                    .height(30.dp)
                    .width(60.dp)
                    .background(Color.Yellow)
            )
            Text(
                text = "Item 2",
                modifier = Modifier
                    .height(30.dp)
                    .width(60.dp)
                    .background(Color.LightGray)
            )
            Text(
                text = "Item 3",
                modifier = Modifier
                    .height(30.dp)
                    .width(60.dp)
                    .background(Color.Magenta)
            )
        }
        Text(
            text = "Pie de Página",
            modifier = Modifier
                .background(Color.Red)
        )

    }
}
@Preview(showBackground = true)
@Composable
fun segundo() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.ciclismo),
            contentDescription = "ciclismo",
            modifier = Modifier
                .padding(18.dp)
        )
        Text(text = "Juan Pérez")
        Text(text = "Dessarrollador Android apasionado por la tecnología y el diseño.")
        Row() {
            Column() {
                Text(text = "150")
                Text(text = "Posts")
            }
            Column() {
                Text(text = "2.3K")
                Text(text = "Seguidores")
            }
            Column() {
                Text(text = "980")
                Text(text = "Likes")
            }
        }
        //Row() {
        //Button(modifier = Modifier) {
        //Text(text="Seguir") }
        //Button(modifier = Modifier) {
        //Text(text="Mensaje") }

        Text(text = "Intereses")
        Row() {
            Column() {
                Text(
                    text = "Ciclismo",
                    modifier = Modifier
                        .background(Color.LightGray)
                )
                Text(
                    text = "Música",
                    modifier = Modifier
                        .background(Color.LightGray)
                )
            }
            Column() {
                Text(
                    text = "Programación",
                    modifier = Modifier
                        .background(Color.LightGray)
                )
                Text(
                    text = "Viajes",
                    modifier = Modifier
                        .background(Color.LightGray)
                )
            }
            Column() {
                Text(
                    text = "UI/UX",
                    modifier = Modifier
                        .background(Color.LightGray)
                )
                Text(
                    text = "Gaming",
                    modifier = Modifier
                        .background(Color.LightGray)
                )
            }
        }
        Text(text="Proyectos Recientes")
        Row(){
            Image(painter = painterResource(R.drawable.ciclismo),
                contentDescription = "Ciclismo")
            Column(modifier = Modifier
                .background(Color.Gray)
                .padding(18.dp)){
                Text(text="App de Ciclismo")
                Text(text="Aplicación para rastrear rutas de ciclismo con mapas y estadísticas.")
                Button() {
                    Text(text="Ver más")
                }
            }
        }
    }
}