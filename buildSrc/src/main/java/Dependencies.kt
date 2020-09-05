private const val kotlinVersion = "1.3.72"
private const val androidGradleVersion = "3.6.0"

//support libs
private const val appcompatVersion = "1.2.0"
private const val constraintLayoutVersion = "2.0.1"
private const val coreKtxVersion = "1.3.1"

//test libs
private const val junitVersion = "4.12"
private const val runnerVersion = "1.1.2"
private const val espressoVersion = "3.3.0"

//coroutines
private const val coroutinesCoreVersion = "1.3.9"
private const val coroutineAndroidVersion = "1.3.9"

object Dependencies{
    object Android {
        val minSdkVersion = 19
        val targetSdkVersion = 30
        val compileSdkVersion = 30
        val applicationId = "com.example.coroutinessample"
        val versionCode = 1
        val versionName = "0.1"
    }
    object Kotlin{
        val kotlin_std = "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"
    }

    object BuildPlugins {
        const val androidGradle = "com.android.tools.build:gradle:$androidGradleVersion"
        const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    }
    object SupportLibs{
        val appcompat = "androidx.appcompat:appcompat:$appcompatVersion"
        val constraint_layout = "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion"
        val core = "androidx.core:core-ktx:$coreKtxVersion"
    }
    object TestLibs{
        val junit = "junit:junit:$junitVersion"
        val espresso = "androidx.test.espresso:espresso-core:$espressoVersion"
        val runner = "androidx.test:runner:$runnerVersion"
    }
    object CoroutineLibs{
        val coroutine_core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesCoreVersion"
        val coroutine_android =  "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutineAndroidVersion"
    }
}