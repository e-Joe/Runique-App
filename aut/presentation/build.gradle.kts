plugins {
    alias(libs.plugins.runique.android.feature.ui)
}

android {
    namespace = "com.ejoe.aut.presentation"
}

dependencies {
    //Koin
    implementation(libs.bundles.koin)

    implementation(projects.core.domain)
    implementation(projects.aut.domain)
}