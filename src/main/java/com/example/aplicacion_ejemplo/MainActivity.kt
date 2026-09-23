package com.example.aplicacion_ejemplo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.aplicacion_ejemplo.ui.theme.Aplicacion_EjemploTheme
import com.example.aplicacion_ejemplo.ui.theme.screen.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Aplicacion_EjemploTheme {
                HomeScreen()
            }
        }
    }
}