package com.silent.creator.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.silent.creator.composetutorial.ui.compose.PersonInfo
import com.silent.creator.composetutorial.ui.compose.PersonInfoCard
import com.silent.creator.composetutorial.ui.theme.ComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeTutorialTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PersonInfoCard(
                        info = PersonInfo("Sunny", "Android Developer"),
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
