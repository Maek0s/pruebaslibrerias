package org.rumbo.librerias.uielements

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

/* SimpleSpacer */

/**
 * Componente simple que representa un espacio vacío para hacer separaciones
 *
 * @param width la cantidad de espacio en anchura
 * @param height la cantidad de espacio en altura
 */
@Composable
@NonRestartableComposable
fun SimpleSpacer(width : Int, height : Int) {
    Spacer(modifier = Modifier.width(width.dp)
                              .height(height.dp))
}

/**
 * Componente simple que representa un espacio vacío para hacer separaciones
 *
 * @param width la cantidad de espacio en anchura
 * @param height la cantidad de espacio en altura
 */
@Composable
@NonRestartableComposable
fun SimpleSpacer(width : Double, height : Int) {
    Spacer(modifier = Modifier.width(width.dp)
                              .height(height.dp))
}

/**
 * Componente simple que representa un espacio vacío para hacer separaciones
 *
 * @param width la cantidad de espacio en anchura
 * @param height la cantidad de espacio en altura
 */
@Composable
@NonRestartableComposable
fun SimpleSpacer(width : Int, height : Double) {
    Spacer(modifier = Modifier.width(width.dp)
                              .height(height.dp))
}

/**
 * Componente simple que representa un espacio vacío para hacer separaciones
 *
 * @param width la cantidad de espacio en anchura
 * @param height la cantidad de espacio en altura
 */
@Composable
@NonRestartableComposable
fun SimpleSpacer(width : Double, height : Double) {
    Spacer(modifier = Modifier.width(width.dp)
                              .height(height.dp))
}

/* SimpleSmallImage */

/**
 * Componente simple que muestra una imagen pequeña
 * Altura: 35dp | Anchura: 40dp
 *
 * @param image imagen que se muestra en formato DrawableResource
 */
@Composable
fun SimpleSmallImage(image : DrawableResource) {
    val imageText : String = image.toString()
    val split = imageText.split(".")
    val iconoText = split[2]

    Image(
        painter = painterResource(resource = image),
        contentDescription = "Icono de un $iconoText",
        modifier = Modifier.height(35.dp)
                           .width(40.dp)
    )
}

/**
 * Componente simple que muestra una imagen pequeña
 * y una descripción requerida
 * Altura: 35dp | Anchura: 40dp
 *
 * @param image imagen que se muestra en formato DrawableResource
 * @param description descripción de la imagen
 */
@Composable
fun SimpleSmallImage(image : DrawableResource, description : String) {
    Image(
        painter = painterResource(resource = image),
        contentDescription = description,
        modifier = Modifier.height(35.dp)
                           .width(40.dp)
    )
}