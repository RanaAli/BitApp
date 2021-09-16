object Versions {
    const val androidGradle = "7.0.2"
    const val kotlinGradle = "1.5.21"

    const val kotlin = "1.4.31"
    const val constraintLayout = "2.0.0-beta4"
    const val coroutines = "1.4.2"
    const val support = "1.1.0"
    const val coreKtx = "1.1.0"
    const val navigation = "2.2.0"
    const val lifecycle = "2.4.0-alpha01"
    const val testing = "2.1.0"
    const val room = "2.2.3"
    const val retrofit = "2.9.0"
    const val retrofitLogInterceptor = "5.0.0-alpha.2"
    const val scarlet = "0.1.12"
    const val moshi = "1.12.0"
    const val glide = "4.11.0"
    const val junit = "4.12"
    const val testRunner = "1.1.0"
    const val espresso = "3.1.1"
    const val material = "1.1.0-beta02"
    const val mockito = "3.2.4"
    const val mockitoKotlin = "2.1.0"
    const val truth = "1.0.1"
    const val viewpager2 = "1.0.0"
    const val hilt = "2.38.1"
    const val hiltJetpack = "1.0.0-alpha03"
    const val compose_version = "1.0.2"
}

object Libs {
    const val kotlinGradlePlugin =
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinGradle}"
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.androidGradle}"
    const val navigationGradlePlugin =
        "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"
    const val hiltGradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"

    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"

    const val appCompat = "androidx.appcompat:appcompat:${Versions.support}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val viewpager2 = "androidx.viewpager2:viewpager2:${Versions.viewpager2}"

    const val corektx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val runtimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    const val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val lifecycleExt = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val livedataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    const val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle}"

    const val navigationFragmentKtx =
        "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"

    const val material = "com.google.android.material:material:${Versions.material}"

    const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.room}"

    const val coroutinesCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val coroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    const val coroutinesTest =
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"

    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitOkHttp = "com.squareup.okhttp3:okhttp:5.0.0-alpha.2"
    const val retrofitGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val retrofitLogInterceptor =
        "com.squareup.okhttp3:logging-interceptor:${Versions.retrofitLogInterceptor}"

    const val scarlet = "com.tinder.scarlet:scarlet:${Versions.scarlet}"
    const val scarletOkHttp = "com.tinder.scarlet:websocket-okhttp:${Versions.scarlet}"
    const val scarletLifecycle = "com.tinder.scarlet:lifecycle-android:${Versions.scarlet}"
    const val scarletAdapterMoshi = "com.tinder.scarlet:message-adapter-moshi:${Versions.scarlet}"
    const val scarletAdapterCoroutines =
        "com.tinder.scarlet:stream-adapter-coroutines:${Versions.scarlet}"

    const val moshi = "com.squareup.moshi:moshi-kotlin:${Versions.moshi}"
    const val moshiCodegen = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.moshi}"

    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glide}"

    const val junit = "junit:junit:${Versions.junit}"
    const val testRunner = "androidx.test.ext:junit:${Versions.testRunner}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val coreTesting = "androidx.arch.core:core-testing:${Versions.testing}"
    const val mockito = "org.mockito:mockito-core:${Versions.mockito}"
    const val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.mockitoKotlin}"
    const val truth = "com.google.truth:truth:${Versions.truth}"

    const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltJetpack = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hiltJetpack}"
    const val hiltJetpackCompiler = "androidx.hilt:hilt-compiler:${Versions.hiltJetpack}"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"

    const val composeUI = "androidx.compose.ui:ui:${Versions.compose_version}"
    const val composeMaterial = "androidx.compose.material:material:${Versions.compose_version}"
    const val composeUIToolingPreview =
        "androidx.compose.ui:ui-tooling-preview:${Versions.compose_version}"
    const val composeUITooling = "androidx.compose.ui:ui-tooling:${Versions.compose_version}"
    const val hiltJetpackCompose = "androidx.hilt:hilt-navigation-compose:${Versions.hiltJetpack}"

    const val activityCompose = "androidx.activity:activity-compose:1.3.1"
    const val lifecycleViewModelCompose = "androidx.activity:activity-compose:1.3.1"
    const val composeNavigation = "androidx.navigation:navigation-compose:2.4.0-alpha08"
    const val hiltNavCompose = "androidx.hilt:hilt-navigation-compose:${Versions.hiltJetpack}"
}

