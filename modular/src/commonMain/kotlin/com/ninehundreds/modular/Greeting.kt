package com.ninehundreds.modular

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}