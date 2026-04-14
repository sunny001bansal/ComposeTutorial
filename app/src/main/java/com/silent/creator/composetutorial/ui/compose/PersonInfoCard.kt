package com.silent.creator.composetutorial.ui.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.silent.creator.composetutorial.R
import com.silent.creator.composetutorial.ui.theme.ComposeTutorialTheme

@Composable
fun PersonInfoCard(info: PersonInfo, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .padding(8.dp)
            .fillMaxWidth()
            .background(Color.Magenta)
    ) {
        Image(
            painter = painterResource(R.drawable.image),
            contentDescription = "Contact profile picture",
            modifier = Modifier
                .padding(4.dp)
                .size(40.dp)
                .clip(CircleShape)
                .background(Color.LightGray),
            contentScale = ContentScale.Fit
        )

        Spacer(modifier = Modifier.width(8.dp))

        Column(
            modifier = Modifier
                .background(Color.Red)
                .padding(2.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = "Name : ${info.name}",
                fontSize = 18.sp,
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(info.position)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewPersonInfoCad() {
    ComposeTutorialTheme {
        PersonInfoCard(PersonInfo("Sunny", "Android Developer"))
    }
}

data class PersonInfo(
    val name: String,
    val position: String,
)
