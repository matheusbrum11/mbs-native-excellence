package br.com.supernova

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform