package org.rumbo.librerias

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform