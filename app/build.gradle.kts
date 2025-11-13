plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.faraz.assessment"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.faraz.assessment"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        // NDK + CMake configuration
        externalNativeBuild {
            cmake {
                cppFlags("-std=c++17", "-O3")
            }
        }

        // Which ABIs to build for
        ndk {
            abiFilters += listOf("armeabi-v7a", "arm64-v8a")
        }
    }

    buildFeatures {
        prefab = true  // required for OpenCV native
    }

    // Link CMakeLists.txt path
    externalNativeBuild {
        cmake {
            path = file("src/main/cpp/CMakeLists.txt")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
}
