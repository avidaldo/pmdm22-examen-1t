package com.example.pmdm22_examen_1t.screens.ej02_tictactoe

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


private const val boardSize = 3

private val spaceByDefault = 8.dp
private val boardPadding = 25.dp

@Composable
fun VerticalBoard() {
    Column(Modifier.padding(boardPadding),
        verticalArrangement = Arrangement.spacedBy(
            space = spaceByDefault,
            alignment = Alignment.CenterVertically)) {

        repeat(boardSize) {
            Row(horizontalArrangement = Arrangement.spacedBy(spaceByDefault)) {
                repeat(boardSize) {
                    Button(onClick = { /*TODO*/ },
                        Modifier
                            .weight(1f)
                            .aspectRatio(1f)) { /*TODO*/ }
                }
            }
        }

    }
}

@Composable
fun HorizontalBoard() {
    Row(Modifier.padding(boardPadding),
        horizontalArrangement = Arrangement.spacedBy(
            space = spaceByDefault,
            alignment = Alignment.CenterHorizontally)) {

        repeat(boardSize) {
            Column(verticalArrangement = Arrangement.spacedBy(spaceByDefault)) {
                repeat(boardSize) {
                    Button(onClick = { /*TODO*/ },
                        Modifier
                            .weight(1f)
                            .aspectRatio(1f)) { /*TODO*/ }
                }
            }
        }

    }
}