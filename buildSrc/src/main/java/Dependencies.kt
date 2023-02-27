object primary {
    const val jvmVersion = "1.8"
    const val kotlinVersion = "1.8.10"
    const val min = 21
    const val compile = 33
    const val target = compile
}

object root {
    const val gradleVersion ="7.4.1"
    const val kotliGradlePlugin =
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${primary.kotlinVersion}"
    const val buildGradle = "com.android.tools.build:gradle:7.3.1"
    const val googleServices = "com.google.gms:google-services:4.3.15"
    const val hiltAndroidGradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:2.45"
    const val crashlyticsPlugin = "com.google.firebase:firebase-crashlytics-gradle:2.9.4"
}

object common {
    const val material = "com.google.android.material:material:1.9.0-alpha02"
    const val serializationJson = "org.jetbrains.kotlinx:kotlinx-serialization-json:1.4.1"
}

object shared {

    object Kotlinx {
        const val datetime = "org.jetbrains.kotlinx:kotlinx-datetime:0.3.3"
    }

    object testing{
        const val mockk = "io.mockk:mockk:1.12.3"
    }
}

object native {
    const val kotlinCompilerExtension = "1.4.2"

    object kotlinx {
        const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4"
        const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4"
    }

    object compose {
        const val lifecycleViewmodel = "androidx.lifecycle:lifecycle-viewmodel-compose:2.6.0-beta01"
        const val activity = "androidx.activity:activity-compose:1.6.1"
        const val navigation = "androidx.navigation:navigation-compose:2.5.3"
        const val ui = "androidx.compose.ui:ui:1.4.0-beta01"
        const val material = "androidx.compose.material:material:1.3.1"
        const val materialIcons = "androidx.compose.material:material-icons-extended:1.4.0-beta01"
        const val constraintlayout = "androidx.constraintlayout:constraintlayout-compose:1.0.1"
        const val compiler = "androidx.compose.compiler:compiler:1.4.2"
        const val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview:1.3.3"
        const val uiTooling = "androidx.compose.ui:ui-tooling:1.3.3"
        const val runtime = "androidx.compose.runtime:runtime:1.3.3"
        const val runtimeLivedata = "androidx.compose.runtime:runtime-livedata:1.3.3"
        const val maps = "com.google.maps.android:maps-compose:2.1.0"
        const val foundation = "androidx.compose.foundation:foundation:1.3.1"
    }

    object core {
        const val appcompat = "androidx.appcompat:appcompat:1.5.1"
        const val constraintlayout = "androidx.constraintlayout:constraintlayout:2.1.4"
        const val splashscreen = "androidx.core:core-splashscreen:1.0.0"
        const val datastore = "androidx.datastore:datastore-preferences:1.0.0"
        const val location = "com.google.android.gms:play-services-location:21.0.1"
        const val maps = "com.google.android.gms:play-services-maps:18.1.0"
        const val barcode = "com.google.mlkit:barcode-scanning:17.0.3"
        const val workerRuntime = "androidx.work:work-runtime-ktx:2.8.0"
    }

    object accompanist {
        const val navigation = "com.google.accompanist:accompanist-navigation-animation:0.25.1"
        const val permissions = "com.google.accompanist:accompanist-permissions:0.24.6-alpha"
        const val systemuicontroller =
            "com.google.accompanist:accompanist-systemuicontroller:0.17.0"
        const val pager = "com.google.accompanist:accompanist-pager:0.28.0"
        const val pagerIndicators = "com.google.accompanist:accompanist-pager-indicators:0.25.0"
    }

    object firebase {
        const val bom = "com.google.firebase:firebase-bom:31.1.1"
        const val firestore = "com.google.firebase:firebase-firestore-ktx:24.4.1"
        const val auth = "com.google.firebase:firebase-auth-ktx:21.1.0"
        const val crashlytics = "com.google.firebase:firebase-crashlytics-ktx:18.3.2"
        const val analytics = "com.google.firebase:firebase-analytics-ktx:21.2.0"
    }

    object testing {
        const val uiTest = "androidx.compose.ui:ui-test-junit4:1.3.3"
        const val uiTestManifest = "androidx.compose.ui:ui-test-manifest:1.3.3"
        const val runner = "androidx.test:runner:1.5.2"
        const val robolectricAnnotations = "org.robolectric:annotations:4.3.1"
        const val mockkAndroid = "io.mockk:mockk-android:1.12.3"
    }

    object hilt {
        const val android = "com.google.dagger:hilt-android:2.45"
        const val navigationCompose = "androidx.hilt:hilt-navigation-compose:1.0.0"
        const val androidCompiler = "com.google.dagger:hilt-android-compiler:2.45"
        const val resourcesCompiler =
            "com.google.dagger:hilt-com.sun.tools.javac.resources.compiler:2.45"
        const val androidTesting = "com.google.dagger:hilt-android-testing:2.45"
    }

    object ok {
        const val okhttp3 = "com.squareup.okhttp3:okhttp:4.10.0"
        const val logging = "com.squareup.okhttp3:logging-interceptor:4.9.2"
    }

    object rx {
        const val rxAndroid = "io.reactivex.rxjava3:rxandroid:3.0.0"
        const val rxjava = "io.reactivex.rxjava3:rxjava:3.0.0"
    }

    object others {
        const val eventbus = "org.greenrobot:eventbus:3.3.1"
        const val balloon = "com.github.skydoves:balloon-compose:1.5.2"
    }

    object camera {
        const val core = "androidx.camera:camera-core:1.2.0-alpha02"
        const val camera2 = "androidx.camera:camera-camera2:1.2.0-alpha02"
        const val lifecycle = "androidx.camera:camera-lifecycle:1.2.0-alpha02"
        const val view = "androidx.camera:camera-view:1.2.0-alpha02"
    }
}