package com.example.compose_article

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_article.ui.theme.Compose_articleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_articleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeArticleApp()

                }
            }
        }
    }
}
@Composable
fun ComposeArticleApp(){

    Column {
        Article(title = stringResource(R.string.title),
            message1 = stringResource(R.string.message1),
            message2 = stringResource(R.string.message2)
                    )
    }
}


@Composable
fun HeroImage(){
    val image = painterResource(R.drawable.bg_compose_background)
    Box {
        Image(
            painter = image,
            contentDescription = "Hero Image",
            modifier = Modifier.fillMaxWidth()
        )
    }
}
@Composable
fun Article(title: String, message1:String, message2: String){

        HeroImage()
        Text(text = title,
        fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )


        Text(text = message1,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )


        Text(text = message2,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp))


}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Compose_articleTheme {
        ComposeArticleApp()
    }
}