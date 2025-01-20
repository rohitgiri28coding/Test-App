package org.example.project

sealed class Content {
    data class Text(val text:String): Content()
    data class Image(val img: String): Content()
}