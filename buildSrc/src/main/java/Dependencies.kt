object KotlinDependencies {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin_version}"
}

object AndroidXDependencies {
    const val coreKtx = "androidx.core:core-ktx:${Versions.core_ktx_version}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appcompat_version}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraint_layout_version}"
    const val lifecycleKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle_version}"
    const val lifecycleJava8 = "androidx.lifecycle:lifecycle-common-java8:${Versions.lifecycle_version}"
    const val hilt = "com.google.dagger:hilt-android:${Versions.hilt_version}"
    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.nav_version}"
    const val navigationUI = "androidx.navigation:navigation-ui-ktx:${Versions.nav_version}"
    const val fragment = "androidx.fragment:fragment-ktx:${Versions.fragment_version}"
    const val legacy = "androidx.legacy:legacy-support-v4:1.0.0"
    const val room = "androidx.room:room-runtime:${Versions.room_version}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.room_version}"
}

object TestDependencies {
    const val jUnit = "junit:junit:${Versions.junit_version}"
    const val androidTest = "androidx.test.ext:junit:${Versions.androidtest_version}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso_version}"
    const val room = "androidx.room:room-testing:${Versions.room_version}"
}

object MaterialDesignDependencies {
    const val materialDesign =
        "com.google.android.material:material:${Versions.material_design_version}"
}

object KaptDependencies {
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt_version}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room_version}"
}

object ThirdPartyDependencies {
    const val gson = "com.google.code.gson:gson:${Versions.gson_version}"
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide_version}"
    const val timber = "com.jakewharton.timber:timber:${Versions.timber_version}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit_version}"
    const val retrofitSerialization =
        "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:${Versions.kotlinx_serialization_version}"
    const val retrofitGsonConverter =
        "com.squareup.retrofit2:converter-gson:${Versions.retrofit_version}"
    const val rxAndroid = "io.reactivex.rxjava3:rxandroid:${Versions.rxAndroid_version}"
    const val rxJava = "io.reactivex.rxjava3:rxjava:${Versions.rxJava_version}"
    const val rxJavaRetrofitAdapter ="com.github.akarnokd:rxjava3-retrofit-adapter:${Versions.rxJava_retrofit_adapter}"
}

object ClassPathPlugins {
    const val hilt = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt_version}"
    const val navigationSafeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.nav_version}"
}
