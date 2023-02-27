package com.realestate

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform