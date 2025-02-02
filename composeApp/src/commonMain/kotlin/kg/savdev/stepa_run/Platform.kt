package kg.savdev.stepa_run

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform