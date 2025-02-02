package kg.savdev.stepa_run

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "StepaRun",
    ) {
        App()
    }
}