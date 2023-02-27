plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.realestate.android"
    compileSdk = primary.compile
    defaultConfig {
        applicationId = "com.realestate.android"
        minSdk = primary.min
        targetSdk = primary.target
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = native.kotlinCompilerExtension
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = primary.jvmVersion
    }
}

dependencies {
    implementation(project(":shared"))
    implementation(native.compose.ui)
    implementation(native.compose.uiTooling)
    implementation(native.compose.uiToolingPreview)
    implementation(native.compose.foundation)
    implementation(native.compose.material)
    implementation(native.compose.activity)
}