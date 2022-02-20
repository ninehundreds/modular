package com.ninehundreds.common

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}