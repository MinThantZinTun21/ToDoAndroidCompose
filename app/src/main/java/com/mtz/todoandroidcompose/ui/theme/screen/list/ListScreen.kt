package com.mtz.todoandroidcompose.ui.theme.screen.list

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun ListScreen(
    navigationToScreen: (Int) -> Unit
) {
    Scaffold(
        content = {},
        floatingActionButton = { ListFab(navigationToScreen) }
    )
}

@Composable
fun ListFab(navigatonToListScreen: (Int) -> Unit) {
    FloatingActionButton(onClick = { navigatonToListScreen(-1)}
       ,
        contentColor = Color.Black) {
        Icon(
            Icons.Default.Add, "",
            tint = Color.Black
        )
    }

}

@Preview
@Composable
fun listScreenPreview() {
    ListScreen { }
}
