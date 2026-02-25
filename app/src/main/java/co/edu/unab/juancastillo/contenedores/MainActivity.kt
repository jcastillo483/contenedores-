package co.edu.unab.juancastillo.contenedores

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.edu.unab.juancastillo.contenedores.ui.theme.ContenedoresTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {


        }
    }
}
@Preview(
    showSystemUi = true)
    @Composable
    fun ContentScreen() {
    Column(
        modifier = Modifier
            .background(Color.Magenta)
            .padding(18.dp)
            .fillMaxSize()
        ,
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(modifier = Modifier.background(Color.Blue).padding(all = 18.dp).fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween)
        {
            Text(text = "inicio", fontSize = 25.sp, modifier = Modifier.background(Color.Red)
            )
            Text(text = "perfil", fontSize = 25.sp, modifier = Modifier.background(Color.Green)
            )
            Text(text = "configuracion", fontSize = 25.sp, modifier = Modifier.background(Color.Yellow)
            )
        }
            Text(text = "titulo principal", fontSize = 25.sp, modifier = Modifier.background(Color.Red)
    )
            Text(text = "decripcion", fontSize = 25.sp, modifier = Modifier.background(Color.Green)
    )
            Text(text = "otro elemento", fontSize = 25.sp, modifier = Modifier.background(Color.Yellow)
    )
    }
    }
