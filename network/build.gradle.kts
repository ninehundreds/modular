
plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization")
    id("com.android.library")
}

kotlin {
    android()
    
    listOf(
        iosX64(),
        iosArm64(),
        //iosSimulatorArm64() sure all ios dependencies support this target
    ).forEach {
        it.binaries.framework {
            baseName = "network"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                api(Deps.kotlinStdLibCommon)
                api(Deps.coroutinesCore)
                api(Deps.serializationJson)

                api(Deps.ktorClientCore)
                api(Deps.ktorClientCIO)
                api(Deps.ktorClientJson)
                api(Deps.ktorClientSerialization)
                api(Deps.ktorClientAuth)
                api(Deps.ktorClientLogging)

                api(project(":common"))
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
        val androidMain by getting {
            dependencies {
                implementation(Deps.kotlinCoreKtx)
                implementation(Deps.coroutinesAndroid)
                api(Deps.ktorClientAndroid)
            }
        }
        val androidTest by getting {
            dependencies {
                implementation(kotlin("test-junit"))
                implementation(Deps.junit)
            }
        }
        val iosX64Main by getting
        val iosArm64Main by getting
        //val iosSimulatorArm64Main by getting
        val iosMain by creating {
            dependencies {
                api(Deps.ktorClientIOS)
            }
            dependsOn(commonMain)
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            //iosSimulatorArm64Main.dependsOn(this)
        }
        val iosX64Test by getting
        val iosArm64Test by getting
        //val iosSimulatorArm64Test by getting
        val iosTest by creating {
            dependsOn(commonTest)
            iosX64Test.dependsOn(this)
            iosArm64Test.dependsOn(this)
            //iosSimulatorArm64Test.dependsOn(this)
        }
    }
}

android {
    compileSdk = ConfigData.compileSdkVersion
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdk = ConfigData.minSdkVersion
        targetSdk = ConfigData.targetSdkVersion
    }
}