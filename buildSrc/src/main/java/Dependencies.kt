/**
 * To define plugins
 */
object BuildPlugins {
    val android by lazy { "com.android.tools.build:gradle:${Versions.gradlePlugin}" }
    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}" }
}

/**
 * To define dependencies
 */
object Deps {
    val appCompat by lazy { "androidx.appcompat:appcompat:${Versions.appCompat}" }
    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}" }
    val kotlinCoreKtx by lazy { "androidx.core:core-ktx:${Versions.kotlinCoreKtx}" }
    val materialDesign by lazy { "com.google.android.material:material:${Versions.material}" }
    val constraintLayout by lazy { "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}" }

    val junit by lazy { "junit:junit:${Versions.jUnit}" }

    val kotlinStdLibCommon by lazy { "org.jetbrains.kotlin:kotlin-stdlib-common" }
    val coroutinesCore by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}" }
    val coroutinesAndroid by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}" }
    val serializationJson by lazy { "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.serializationJson}" }

    val ktorClientCore by lazy { "io.ktor:ktor-client-core:${Versions.ktor}" }
    val ktorClientCIO by lazy { "io.ktor:ktor-client-cio:${Versions.ktor}" }
    val ktorClientJson by lazy { "io.ktor:ktor-client-json:${Versions.ktor}" }
    val ktorClientSerialization by lazy { "io.ktor:ktor-client-serialization:${Versions.ktor}" }
    val ktorClientAuth by lazy { "io.ktor:ktor-client-auth:${Versions.ktor}" }
    val ktorClientLogging by lazy { "io.ktor:ktor-client-logging:${Versions.ktor}" }
    val ktorClientAndroid by lazy { "io.ktor:ktor-client-android:${Versions.ktor}" }
    val ktorClientIOS by lazy { "io.ktor:ktor-client-ios:${Versions.ktor}" }

    val kermit by lazy { "co.touchlab:kermit:${Versions.kermit}" }

}