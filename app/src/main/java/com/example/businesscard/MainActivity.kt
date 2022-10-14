package com.example.businesscard


import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import android.widget.Toast as WToast



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCardWithText(header = "android",main="Jennifer Doe", sub = "Android developer Extraordinate",email="jenniferdoe@gmail.com",contact="8078675464")


                }
            }
        }
    }
}





@Composable
fun BusinessCardWithText(header: String,main: String,sub: String,email: String,contact: String) {
    val image = painterResource(R.drawable.androidimage)
    val imageCall = painterResource(R.drawable.call)
    val imageemail = painterResource(R.drawable.email_image)


    Box(
        modifier = Modifier
            .fillMaxHeight()
            .background(Color.Blue)

    ) {


        Column(
            Modifier

                .fillMaxSize()
                .padding(top = 16.dp),

            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .padding(
                        start = 110.dp,
                        top = 120.dp,
                        end = 100.dp,
                        bottom = 9.dp
                    )


            )
            Text(
                text = header,
                fontSize = 30.sp,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.CenterHorizontally)

                    .padding(
                        start = 12.dp,
                        top = 16.dp,
                        end = 18.dp,
                        bottom = 9.dp
                    )
            )
            Text(
                text = main,
                fontSize = 36.sp,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.CenterHorizontally)

                    .padding(
                        start = 16.dp,
                        top = 16.dp,
                        end = 16.dp,
                        bottom = 16.dp
                    )
            )

            Text(
                text = sub,
                fontSize = 24.sp,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.CenterHorizontally)

                    .padding(
                        start = 16.dp,
                        top = 16.dp,
                        end = 16.dp,
                        bottom = 16.dp

                    )
            )
        }

        Column(
            Modifier
                .fillMaxHeight()
                .padding(start = 50.dp, top = 700.dp, bottom = 5.dp, end = 80.dp),

            verticalArrangement = Arrangement.Bottom,
            // horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(modifier=Modifier.fillMaxWidth()){
                Image(
                    painter = imageCall,
                    contentDescription = null,
                    modifier = Modifier
                        .padding(
                            start = 70.dp,
                            end = 40.dp,
                            bottom = 4.dp


                        ).weight (1f)

                )

                Text(
                    text = contact,
                    fontSize = 18.sp,
                    color = Color.White,
                    modifier = Modifier.padding(start = 10.dp, bottom = 10.dp, end = 12.dp,).weight(1f)


                )
            }
            Row(modifier=Modifier.fillMaxWidth()){
                Image(
                    painter = imageemail,
                    contentDescription = null,
                    modifier = Modifier
                        .padding(
                            start = 10.dp,
                            end =2.dp,

                        bottom=50.dp
                        ).weight(1f)

                )
                Text(
                    text = email,
                    fontSize = 12.sp,
                    color = Color.White,
                    modifier = Modifier.padding(

                        end =40.dp,


                    ).weight(1f)


                )
            }


        }
    }

}



@Preview(showBackground = true)
@Composable
fun BusinessCardWithTextPreview() {
    BusinessCardTheme {
        BusinessCardWithText(header = "android",main="Jennifer Doe", sub = "Android developer Extraordinate",email="jenniferdoe@gmail.com",contact="8078675464")


    }
}


