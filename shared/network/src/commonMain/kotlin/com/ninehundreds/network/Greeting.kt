package com.ninehundreds.network

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}