package com.faraz.assessment

object NativeBridge {
    init {
        System.loadLibrary("native-lib")
    }

    external fun stringFromJNI(): String
}
