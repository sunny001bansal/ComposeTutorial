package com.silent.creator.composetutorial

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import com.silent.creator.composetutorial.ui.compose.PersonInfo
import com.silent.creator.composetutorial.ui.compose.PersonInfoCard
import com.silent.creator.composetutorial.ui.theme.ComposeTutorialTheme
import org.junit.Rule
import org.junit.Test

class PersonInfoCardTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun displaysNameAndPosition() {
        val name = "Sunny Bansal"
        val position = "Software Engineer"
        val personInfo = PersonInfo(name, position)

        composeTestRule.setContent {
            ComposeTutorialTheme {
                PersonInfoCard(info = personInfo)
            }
        }

        composeTestRule.onNodeWithText("Name : $name").assertIsDisplayed()
        composeTestRule.onNodeWithText(position).assertIsDisplayed()
    }
}
