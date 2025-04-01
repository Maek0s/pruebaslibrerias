package org.rumbo.librerias.vistas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import org.jetbrains.compose.resources.painterResource
import org.rumbo.librerias.uielements.SimpleSpacer
import pruebaslibrerias.composeapp.generated.resources.*
import pruebaslibrerias.composeapp.generated.resources.salir

class TareasAutomaticas : Screen {
    @Composable
    override fun Content() {
        Column(modifier = Modifier.fillMaxSize()) {
            val navigator = LocalNavigator.currentOrThrow

            Box(modifier = Modifier.fillMaxWidth()
                .fillMaxHeight(0.10f),
                contentAlignment = Alignment.TopCenter
            ) {
                Box(contentAlignment = Alignment.Center,
                    modifier = Modifier.fillMaxSize()
                        .background(Color(0xffD0E2F4))
                ) {
                    Row (verticalAlignment = Alignment.CenterVertically) {
                        Text("Menú Aplicación", fontWeight = FontWeight.Bold,
                            fontSize = 20.sp, textAlign = TextAlign.Center)
                    }
                }
            }

            // Parte central
            Box(modifier = Modifier.fillMaxHeight(0.75f)
                .align(Alignment.CenterHorizontally)
                .padding(10.dp),
                contentAlignment = Alignment.Center) {
                Text("Pantalla de Tareas automáticas",
                    fontSize = 20.sp)
            }

            // Parte inferior
            Box(modifier = Modifier.fillMaxSize()
                .align(Alignment.End),
                contentAlignment = Alignment.Center
            ) {
                BoxWithConstraints(contentAlignment = Alignment.Center,
                    modifier = Modifier.fillMaxSize()
                        .background(Color(0xffD0E2F4))
                ) {
                    Row (verticalAlignment = Alignment.CenterVertically) {
                        //InferiorOption(onClick = { index = onClickBack(index) },
                        //    Res.drawable.anterior, "Icono anterior")

                        SimpleSpacer(10, 0)

                        //InferiorOption(onClick = { index = onClickNext(index, optionsList) },
                        //    Res.drawable.siguiente, "Icono siguiente")

                        SimpleSpacer(80, 0)

                        IconButton(onClick = { navigator.pop() } ) {
                            Image(painter = painterResource(Res.drawable.salir),
                                contentDescription = ""
                            )
                        }
                    }
                }
            }
        }
    }
}